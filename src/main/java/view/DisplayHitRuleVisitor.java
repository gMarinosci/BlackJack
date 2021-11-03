package view;

import model.rules.BasicHitStrategy;
import model.rules.Soft17HitStrategy;

/**
 * Implements the HitRuleVisitor interface by displaying what hit rule is being
 * used at the start of a new game.
 */
public class DisplayHitRuleVisitor  implements model.rules.HitRuleVisitor {

  @Override
  public void visit(BasicHitStrategy basicHitStrategy) {
    System.out.println("Hit Rule: Basic ");
  }

  @Override
  public void visit(Soft17HitStrategy soft17HitStrategy) {
    System.out.println("Hit Rule: Soft 17 ");
  }
}
