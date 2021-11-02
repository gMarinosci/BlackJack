package view;

import java.util.List;
import model.Card;

/**
 * Encapsulates the generic view functionality.
 */
public abstract class View {

  /**
   * Shows a welcome message.
   */
  public abstract void displayWelcomeMessage();

  public abstract void displayMenu();

  public abstract void newGameMessage();

  public void displayCard(model.Card card) {
    System.out.println("" + card.getValue() + " of " + card.getColor());
  }

  public void displayHand(String name, Iterable<model.Card> hand, int score) {
    System.out.println(name + " Has: ");
    for (model.Card c : hand) {
      displayCard(c);
    }
    System.out.println("Score: " + score);
    System.out.println("");
  }

  public void displayPlayerHand(Iterable<model.Card> hand, int score) {
    displayHand("Player", hand, score);
  }

  public void displayDealerHand(Iterable<model.Card> hand, int score) {
    displayHand("Dealer", hand, score);
  }

  /**
   * Returns pressed characters from the keyboard.

   * @return the pressed character.
   */
  public int getInput() {
    try {
      int c = System.in.read();
      while (c == '\r' || c == '\n') {
        c = System.in.read();
      }
      return c;
    } catch (java.io.IOException e) {
      System.out.println("" + e);
      return 0;
    }
  }

  /**
   * Displays a card.

   * @param card The card to display.
   */
  public void displayPlayerCard(model.Card card, int score, Iterable<Card> hand) {
    System.out.print("Player draws: ");
    displayCard(card);
    System.out.println();
  }

  public void displayDealerCard(model.Card card, int score, Iterable<Card> hand) {
    System.out.print("Dealer draws: ");
    displayCard(card);
    System.out.println();
  }
  /**
   * Displays the winner of the game.

   * @param dealerIsWinner True if the dealer is the winner.
   */
  public abstract void displayGameOver(boolean dealerIsWinner);

  public abstract void displayPause();
}