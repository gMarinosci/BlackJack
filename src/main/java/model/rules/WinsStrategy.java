package model.rules;

import model.Dealer;
import model.Deck;
import model.Player;

/**
 * Rule interface for managing the who wins the game.
 */
public interface WinsStrategy {
  /**
   * @return True if the player won.
   */
  boolean winGame();
}
