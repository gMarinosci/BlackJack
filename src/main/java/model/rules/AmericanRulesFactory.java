package model.rules;

public class AmericanRulesFactory implements AbstractRulesFactory {
  @Override
  public HitStrategy createHitRule() {
    return new BasicHitStrategy();
  }

  @Override
  public WinsStrategy createWinRule() {
    return new DealerWinsStrategy();
  }

  @Override
  public NewGameStrategy createGameRule() {
    return new AmericanNewGameStrategy();
  }
}
