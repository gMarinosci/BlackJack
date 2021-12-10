package model.rules;

import model.Player;
import view.EnglishRulesVisitor;

/**
 * Describes the hit behaviour of the dealer.
 */
public class BasicHitStrategy implements HitStrategy {
  private static final int hitLimit = 17;

  public boolean doHit(Player dealer) {
    return dealer.calcScore() < hitLimit;
  }

  @Override
  public void accept(EnglishRulesVisitor visitor) {
    visitor.visit(this);
  }
}