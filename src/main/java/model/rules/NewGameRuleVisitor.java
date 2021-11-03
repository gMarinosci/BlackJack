package model.rules;

public interface NewGameRuleVisitor {

  void visit(AmericanNewGameStrategy americanNewGameStrategy);

  void visit(InternationalNewGameStrategy internationalNewGameStrategy);
}
