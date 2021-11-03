package model.rules;

public interface HitRuleVisitor {

  void visit(BasicHitStrategy basicHitStrategy);

  void visit(Soft17HitStrategy soft17HitStrategy);
}
