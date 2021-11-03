package view;

import model.rules.AmericanNewGameStrategy;
import model.rules.InternationalNewGameStrategy;
import model.rules.NewGameRuleVisitor;

public class DisplayNewGameRuleVisitor implements NewGameRuleVisitor {

  @Override
  public void visit(AmericanNewGameStrategy americanNewGameStrategy) {
    System.out.println("New Game Rule: ");
  }

  @Override
  public void visit(InternationalNewGameStrategy internationalNewGameStrategy) {
    System.out.println("New Game Rule: ");
  }
}
