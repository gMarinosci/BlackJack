package view;


import java.util.List;
import model.Card;

/**
 * Implements an english console view.
 */
public class EnglishView extends ViewBase {

  /**
   * Shows a welcome message.
   */
  public void displayWelcomeMessage() {
    for (int i = 0; i < 5; i++) {
      System.out.print("\n");
    }
    System.out.println("Hello Black Jack World");
  }

  public void displayMenu() {
    System.out.println("Type 'h' to Hit, 's' to Stand or 'q' to Quit\n");
  }

  public void newGameMessage() {
    System.out.println("Type 'p' to start a new game or 'q' to quit.");
  }

  /**
   * Displays winner message when the game is over.

   * @param dealerIsWinner True if the dealer is the winner.
   */
  public void displayGameOver(boolean dealerIsWinner) {
    System.out.println("GameOver: ");
    if (dealerIsWinner) {
      System.out.println("Dealer Won!");
    } else {
      System.out.println("You Won!");
      System.out.println();
    }
  }

  /**
   * Displays pause used in observer pattern implementation requirement.
   */
  public void displayPause() {
    System.out.println("\n*pause*\n");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
