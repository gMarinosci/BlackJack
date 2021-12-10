package model.rules;

import model.Dealer;
import model.Deck;
import model.Player;
import view.EnglishRulesVisitor;

/**
 * Describes the international rules for the start of a new game.
 */
public class InternationalNewGameStrategy implements NewGameStrategy {

  /**
   * Player receives on card while the dealer receives only one.

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

    return true;
  }

  @Override
  public void accept(EnglishRulesVisitor visitor) {
    visitor.visit(this);
  }
}