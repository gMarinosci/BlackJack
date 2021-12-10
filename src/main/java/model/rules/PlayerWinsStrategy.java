package model.rules;

import view.EnglishRulesVisitor;

/**
 * Functionality that lets the player win, if the score is equal.
 */
public class PlayerWinsStrategy implements WinsStrategy {


  /**
   *Player is winner, if score is equal.

   * @return True if the player won.
   */
  public boolean winGame() {
    return false;
  }

  @Override
  public void accept(EnglishRulesVisitor visitor) {
    visitor.visit(this);
  }
}
