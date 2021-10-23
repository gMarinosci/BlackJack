package model.rules;

import model.Card;
import model.Dealer;
import model.Deck;
import model.Player;


class InternationalNewGameStrategy implements NewGameStrategy {

  public boolean newGame(Deck deck, Dealer dealer, Player player) {
    //player turn
    player.playerTurn(deck, player, true);
    //dealer turn
    dealer.dealerTurn(deck, dealer, true);
    //player turn
    player.playerTurn(deck, player, true);

    return true;
  }
}