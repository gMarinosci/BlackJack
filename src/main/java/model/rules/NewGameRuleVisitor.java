package model.rules;

/**
 * Visitor interface for the new game rules.
 */
public interface NewGameRuleVisitor {

  void visit(AmericanNewGameStrategy americanNewGameStrategy);

  void visit(InternationalNewGameStrategy internationalNewGameStrategy);
}
