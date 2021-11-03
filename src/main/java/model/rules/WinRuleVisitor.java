package model.rules;

public interface WinRuleVisitor {

  void visit(DealerWinsStrategy dealerWinsStrategy);

  void visit(PlayerWinsStrategy playerWinsStrategy);
}
