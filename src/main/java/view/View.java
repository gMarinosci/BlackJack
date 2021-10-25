package view;

import model.Card;

import java.util.List;

/**
 * Encapsulates the generic view functionality.
 */
public interface View {

  /**
   * Shows a welcome message.
   */
  void displayWelcomeMessage();

  void displayMenu();

  void newGameMessage();

  /**
   * Returns pressed characters from the keyboard.

   * @return the pressed character.
   */
  int getInput();

  /**
   * Displays a card.

   * @param card The card to display.
   */
  void displayPlayerCard(model.Card card, int score, Iterable<Card> hand);

  void displayDealerCard(model.Card card, int score, Iterable<Card> hand);

  /**
   * Displays the winner of the game.

   * @param dealerIsWinner True if the dealer is the winner.
   */
  void displayGameOver(boolean dealerIsWinner);

  void displayPause();
}