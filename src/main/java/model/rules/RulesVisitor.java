package model.rules;

/**
 * Visitor interface for all the rules in the game.
 */
public interface RulesVisitor {

  void visit(DealerWinsStrategy dealerWinsStrategy);

  void visit(PlayerWinsStrategy playerWinsStrategy);

  void visit(AmericanNewGameStrategy americanNewGameStrategy);

  void visit(InternationalNewGameStrategy internationalNewGameStrategy);

  void visit(BasicHitStrategy basicHitStrategy);

  void visit(Soft17HitStrategy soft17HitStrategy);
}
