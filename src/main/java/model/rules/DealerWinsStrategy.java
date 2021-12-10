package model.rules;

import view.EnglishRulesVisitor;

/**
 * Functionality that lets the dealer win, if the score is equal.
 */
public class DealerWinsStrategy implements WinsStrategy {

  /**
   *Dealer is the winner, if score is equal.

   * @return True if the dealer won.
   */
  public boolean winGame() {
    return true;
  }

  @Override
  public void accept(EnglishRulesVisitor visitor) {
    visitor.visit(this);
  }
}
