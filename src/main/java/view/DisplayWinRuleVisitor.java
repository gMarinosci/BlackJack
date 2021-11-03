package view;

import model.rules.DealerWinsStrategy;
import model.rules.PlayerWinsStrategy;
import model.rules.WinRuleVisitor;

public class DisplayWinRuleVisitor implements WinRuleVisitor {

  @Override
  public void visit(DealerWinsStrategy dealerWinsStrategy) {
    System.out.println("Win Rule: ");
  }

  @Override
  public void visit(PlayerWinsStrategy playerWinsStrategy) {
    System.out.println("Win Rule: ");
  }
}
