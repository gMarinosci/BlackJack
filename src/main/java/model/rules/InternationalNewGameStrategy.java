package model.rules;

import model.Card;
import model.Dealer;
import model.Deck;
import model.Player;


class InternationalNewGameStrategy implements NewGameStrategy {

  public boolean newGame(Deck deck, Dealer dealer, Player player) {
    //player turn
    playTurn(deck, player, true);
    //dealer turn
    playTurn(deck, dealer, true);
    //player turn
    playTurn(deck, player, true);

    return true;
  }

  public void playTurn(Deck deck, Player player, boolean bool) {
    Card.Mutable c;
    c = deck.getCard();
    c.show(bool);
    player.dealCard(c);
  }
}