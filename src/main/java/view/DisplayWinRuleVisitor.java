package view;

import model.rules.DealerWinsStrategy;
import model.rules.PlayerWinsStrategy;
import model.rules.WinRuleVisitor;

/**
 * Implements the WinRuleVisitor interface by displaying what hit rule is being
 * used at the start of a new game.
 */
public class DisplayWinRuleVisitor implements WinRuleVisitor {

  @Override
  public void visit(DealerWinsStrategy dealerWinsStrategy) {
    System.out.println("Win Rule: Dealer wins in case of a draw\n");
  }

  @Override
  public void visit(PlayerWinsStrategy playerWinsStrategy) {
    System.out.println("Win Rule: Player wins in case of a draw\n");
  }
}
