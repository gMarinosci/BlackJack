package view;

import model.Card;

import java.util.List;

/**
 * Implements an english console view.
 */
public class EnglishView implements View {

  /**
   * Shows a welcome message.
   */
  public void displayWelcomeMessage() {
    for (int i = 0; i < 50; i++) {
      System.out.print("\n");
    }
    System.out.println("Hello Black Jack World");
    System.out.println("Type 'p' to Play, 'h' to Hit, 's' to Stand or 'q' to Quit\n");
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

  public void displayPlayerCard(model.Card card, int score, Iterable<Card> hand) {
    System.out.print("Player: ");
    for (Card c: hand) {
      System.out.print(c.getValue() + " of " + c.getColor() + " ");
    }
    System.out.println(card.getValue() + " of " + card.getColor() + "Player gets new card");
  }

  public void displayDealerCard(model.Card card, int score, Iterable<Card> hand) {
    System.out.print("Dealer: ");
    for (Card c: hand) {
      System.out.print(c.getValue() + " of " + c.getColor() + " ");
    }
    System.out.println(card.getValue() + " of " + card.getColor() + "Dealer gets new card");
  }



  /**
   * Displays the winner of the game.

   * @param dealerIsWinner True if the dealer is the winner.
   */
  public void displayGameOver(boolean dealerIsWinner) {
    System.out.println("GameOver: ");
    if (dealerIsWinner) {
      System.out.println("Dealer Won!");
    } else {
      System.out.println("You Won!");
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
