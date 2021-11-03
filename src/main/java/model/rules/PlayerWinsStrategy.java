package model.rules;

import model.Dealer;
import model.Deck;
import model.Player;

/**
 * Functionality that lets the player win, if the score is equal.
 */
public class PlayerWinsStrategy implements WinsStrategy{


  /**
   *Player is winner, if score is equal.

   * @return True if the player won.
   */
  public boolean winGame() {
    return false;
  }

  @Override
  public void accept(WinRuleVisitor visitor) {
    visitor.visit(this);
  }
}
