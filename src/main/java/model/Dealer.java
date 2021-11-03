package model;


import model.rules.AbstractRulesFactory;
import model.rules.HitStrategy;
import model.rules.NewGameStrategy;
import model.rules.WinsStrategy;

/**
 * Represents a dealer player that handles the deck of cards and runs the game using rules.
 */
public class Dealer extends Player implements Cloneable {
  private WinsStrategy winsRule;
  private Deck deck;
  private NewGameStrategy newGameRule;
  private HitStrategy hitRule;

  /**
   * Initializing constructor.

   * @param finishedRulesFactory A factory that creates the rules to use.
   */
  public Dealer(AbstractRulesFactory finishedRulesFactory) {

    newGameRule = finishedRulesFactory.createGameRule();
    hitRule = finishedRulesFactory.createHitRule();
    winsRule = finishedRulesFactory.createWinRule();
  }

  /**
   * Starts a new game if the game is not currently under way.

   * @param player The player to play agains.
   * @return True if the game could be started.
   */
  public boolean newGame(Player player) {
    if (deck == null || isGameOver()) {
      deck = new Deck();
      clearHand();
      player.clearHand();
      return newGameRule.newGame(deck, this, player);
    }
    return false;
  }

  /**
   * Gives the player one more card if possible. I.e. the player hits.

   * @param player The player to give a card to.
   * @return true if the player could get a new card, false otherwise.
   */
  public boolean hit(Player player) {
    if (deck != null && player.calcScore() < maxScore && !isGameOver()) {
      playerTurn(deck, player, true);
      return true;
    }
    return false;
  }

  /**
   * Checks if the dealer is the winner compared to a player.

   * @param player The player to check against.
   * @return True if the dealer is the winner, false if the player is the winner.
   */
  public boolean isDealerWinner(Player player) {
    if (player.calcScore() > maxScore) {
      return true;
    } else if (calcScore() > maxScore) {
      return false;
    } else if (calcScore() == player.calcScore()) {
      return winsRule.winGame();
    }
    return calcScore() >= player.calcScore();
  }

  /**
   * Checks if the game is over, i.e. the dealer can take no more cards.

   * @return True if the game is over.
   */
  public boolean isGameOver() {
    if (deck != null && hitRule.doHit(this) != true) {
      return true;
    }
    return false;
  }

  /**
   * The player has chosen to take no more cards, it is the dealers turn.
   */
  public boolean stand() {
    if (deck != null) {
      showHand();
      while (hitRule.doHit(this) == true) {
        dealerTurn(deck, this, true);
      }
      return true;
    }
    return false;
  }

  /**
   * It is the dealers turn. Was implemented to distinguish between player and dealer when notifying subscribers.

   */
  public void dealerTurn(Deck deck, Dealer dealer, boolean bool) {
    Card.Mutable c;
    c = deck.getCard();
    c.show(bool);
    dealer.dealCard(c);
    notifySubscribers(c, 2);
  }

  public WinsStrategy getWinsRule() {
    return winsRule;
  }

  public NewGameStrategy getNewGameRule() {
    return newGameRule;
  }

  public HitStrategy getHitRule() {
    return hitRule;
  }
}