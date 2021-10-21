package model.rules;

import model.Dealer;
import model.Deck;
import model.Player;

public class DealerWinsStrategy implements WinsStrategy {

  /**
   *
   * @return True if the dealer won.
   */


  public boolean winGame() {
    return true;
  }
}
