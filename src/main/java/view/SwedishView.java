package view;

import model.Card;

import java.util.List;

/**
 * Implements a Swedish console view.
 */
public class SwedishView implements View {

  /**
   * Shows a welcome message.
   */
  public void displayWelcomeMessage() {
    for (int i = 0; i < 50; i++) {
      System.out.print("\n");
    }

    System.out.println("Hej Black Jack Världen");
    System.out.println("----------------------");
    System.out.println("Skriv 'p' för att Spela, 'h' för nytt kort, 's' för att stanna 'q' för att avsluta\n");
  }

  public void displayMenu() {
    System.out.println("Type 'p' to start a new game, 'h' to Hit, 's' to Stand or 'q' to Quit\n");
  }

  public void newGameMessage() {
    System.out.println("Type 'p' to start a new game.");
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

  }
  public void displayDealerCard(model.Card card, int score, Iterable<Card> hand) {

  }

  /**
   * Displays the winner of the game.

   * @param dealerIsWinner True if the dealer is the winner.
   */
  public void displayGameOver(boolean dealerIsWinner) {
    System.out.println("Slut: ");
    if (dealerIsWinner) {
      System.out.println("Croupiern Vann!");
    } else {
      System.out.println("Du vann!");
    }
  }

  public void displayPause() {
    System.out.println("\n*paus*\n");
    try {
      Thread.sleep(2000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
  }


}
