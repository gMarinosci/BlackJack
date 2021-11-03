package view;

import model.rules.AmericanNewGameStrategy;
import model.rules.InternationalNewGameStrategy;
import model.rules.NewGameRuleVisitor;

/**
 * Implements the NewGameRuleVisitor interface by displaying what hit rule is being
 * used at the start of a new game.
 */
public class DisplayNewGameRuleVisitor implements NewGameRuleVisitor {

  @Override
  public void visit(AmericanNewGameStrategy americanNewGameStrategy) {
    System.out.println("\nGame Rule: American");
  }

  @Override
  public void visit(InternationalNewGameStrategy internationalNewGameStrategy) {
    System.out.println("\nGame Rule: International");
  }
}
