package model.rules;

import model.Dealer;
import model.Deck;
import model.Player;

/**
 * Rule interface for managing who wins the game.
 */
public interface WinsStrategy {
  /**
   * Who wins when the score is equal depends on whether DealerWinsStrategy or PlayerWinsStrategy is chosen.
   
   * @return True if either the player or dealer won.
   */
  boolean winGame();
}
