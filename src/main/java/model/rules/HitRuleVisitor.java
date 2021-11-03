package model.rules;

/**
 * Visitor interface for the hit rule.
 */
public interface HitRuleVisitor {

  void visit(BasicHitStrategy basicHitStrategy);

  void visit(Soft17HitStrategy soft17HitStrategy);
}
