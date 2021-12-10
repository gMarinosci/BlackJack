package view;

import model.Card;

/**
 * Interface for the implementation of the view.
 */
public interface View {

  void displayWelcomeMessage();

  void displayMenu();

  void newGameMessage();

  void displayGameOver(boolean dealerIsWinner);

  void displayPause();

  void displayPlayerHand(Iterable<model.Card> hand, int score);

  void displayDealerHand(Iterable<model.Card> hand, int score);

  int getInput();

  void displayPlayerCard(model.Card card, int score, Iterable<Card> hand);

  void displayDealerCard(model.Card card, int score, Iterable<Card> hand);
}
