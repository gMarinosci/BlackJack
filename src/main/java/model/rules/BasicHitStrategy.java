package model.rules;

import model.Player;

/**
 * Describes the hit behaviour of the dealer.
 */
public class BasicHitStrategy implements HitStrategy {
  private static final int hitLimit = 17;

  public boolean doHit(Player dealer) {
    return dealer.calcScore() < hitLimit;
  }

  @Override
  public void accept(HitRuleVisitor visitor) {
    visitor.visit(this);
  }
}