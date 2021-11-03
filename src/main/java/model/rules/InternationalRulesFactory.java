package model.rules;

/**
 * Combination of rules to implement the abstract factory.
 */
public class InternationalRulesFactory implements AbstractRulesFactory {

  @Override
  public HitStrategy createHitRule() {
    return new Soft17HitStrategy();
  }

  @Override
  public WinsStrategy createWinRule() {
    return new PlayerWinsStrategy();
  }

  @Override
  public NewGameStrategy createGameRule() {
    return new InternationalNewGameStrategy();
  }
}
