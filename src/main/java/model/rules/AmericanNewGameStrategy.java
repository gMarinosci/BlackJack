package model.rules;

import model.Card;
import model.Dealer;
import model.Deck;
import model.Player;

public class AmericanNewGameStrategy implements NewGameStrategy{

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

  public void accept(NewGameRuleVisitor visitor) {
    visitor.visit(this);
  }
}