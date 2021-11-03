package model.rules;

/**
 * Abstract factory interface for the rules of the game.
 */
public interface AbstractRulesFactory {

  HitStrategy createHitRule();

  WinsStrategy createWinRule();

  NewGameStrategy createGameRule();

}
