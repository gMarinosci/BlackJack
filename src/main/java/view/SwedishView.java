package view;

import java.util.List;
import model.Card;

/**
 * Implements a Swedish console view.
 */
public class SwedishView extends ViewBase {

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
   * Displays winner message when the game is over.

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

  /**
   * implements the pause between each draw.
   */
  public void displayPause() {
    System.out.println("\n*paus*\n");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
