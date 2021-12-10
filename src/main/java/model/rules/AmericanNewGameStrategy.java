package model.rules;

import model.Dealer;
import model.Deck;
import model.Player;
import view.EnglishRulesVisitor;

/**
 * Describes the American rules for the start of a new game.
 */
public class AmericanNewGameStrategy implements NewGameStrategy {

  /**
   * Both Dealer and Player receive two cards.
   * Dealer's second card is initially kept hidden.

   * @param deck The deck to use to get cards from.
   * @param dealer The dealer to deal cards to.
   * @param player The player to deal cards to.
   * @return true.
   */
  public boolean newGame(Deck deck, Dealer dealer, Player player) {
    //player turn
    player.playerTurn(deck, player, true);
    //dealer turn
    dealer.dealerTurn(deck, dealer, true);
    //player turn
    player.playerTurn(deck, player, true);
    //dealer turn
    dealer.dealerTurn(deck, dealer, false);

    return true;
  }

  public void accept(EnglishRulesVisitor visitor) {
    visitor.visit(this);
  }
}