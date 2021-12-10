package view;

import model.rules.AmericanNewGameStrategy;
import model.rules.BasicHitStrategy;
import model.rules.DealerWinsStrategy;
import model.rules.InternationalNewGameStrategy;
import model.rules.PlayerWinsStrategy;
import model.rules.RulesVisitor;
import model.rules.Soft17HitStrategy;

/**
 * Implements the RulesVisitor interface by displaying what combination
 * of rules is being used in the game.
 */
public class EnglishRulesVisitor implements RulesVisitor {

  @Override
  public void visit(DealerWinsStrategy dealerWinsStrategy) {
    System.out.println("Win Rule: Dealer wins in case of a draw\n");
  }

  @Override
  public void visit(PlayerWinsStrategy playerWinsStrategy) {
    System.out.println("Win Rule: Player wins in case of a draw\n");
  }

  @Override
  public void visit(BasicHitStrategy basicHitStrategy) {
    System.out.println("Hit Rule: Basic ");
  }

  @Override
  public void visit(Soft17HitStrategy soft17HitStrategy) {
    System.out.println("Hit Rule: Soft 17 ");
  }

  @Override
  public void visit(AmericanNewGameStrategy americanNewGameStrategy) {
    System.out.println("\nGame Rule: American");
  }

  @Override
  public void visit(InternationalNewGameStrategy internationalNewGameStrategy) {
    System.out.println("\nGame Rule: International");
  }
}
