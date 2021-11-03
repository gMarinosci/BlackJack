package model.rules;

/**
 * Describes a combination of rules to implement the
 * abstract factory.
 */
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
