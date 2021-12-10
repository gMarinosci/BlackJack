package view;

import model.rules.*;

public class SwedishRulesVisitor implements RulesVisitor {

  @Override
  public void visit(DealerWinsStrategy dealerWinsStrategy) {
    System.out.println("Vinstregel: Dealern vinner vid oavgjort\n");
  }

  @Override
  public void visit(PlayerWinsStrategy playerWinsStrategy) {
    System.out.println("Vinstregel: Spelaren vinner vid oavgjort\n");
  }

  @Override
  public void visit(BasicHitStrategy basicHitStrategy) {
    System.out.println("Nytt kort regel: Basic ");
  }

  @Override
  public void visit(Soft17HitStrategy soft17HitStrategy) {
    System.out.println("Nytt kort regel: Soft 17 ");
  }

  @Override
  public void visit(AmericanNewGameStrategy americanNewGameStrategy) {
    System.out.println("\nSpelregel: Amerikansk");
  }

  @Override
  public void visit(InternationalNewGameStrategy internationalNewGameStrategy) {
    System.out.println("\nSpelregel: Internetionell");
  }
}
