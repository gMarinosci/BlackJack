package model.rules;

/**
 * Visitor interface for the rules that describe who should win in case of a draw.
 */
public interface WinRuleVisitor {

  void visit(DealerWinsStrategy dealerWinsStrategy);

  void visit(PlayerWinsStrategy playerWinsStrategy);
}
