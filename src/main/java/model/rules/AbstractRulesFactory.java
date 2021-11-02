package model.rules;

public interface AbstractRulesFactory {

  public HitStrategy createHitRule();

  public WinsStrategy createWinRule();

  public NewGameStrategy createGameRule();

}
