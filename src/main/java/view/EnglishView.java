package view;


import java.util.List;
import model.Card;

/**
 * Implements an english console view.
 */
public class EnglishView implements View {

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

  public void displayCard(model.Card card) {
    System.out.println("" + card.getValue() + " of " + card.getColor());
  }

  /**
   * Displays the hand of a dealer or player.

   * @param name either dealer or player.
   * @param hand to display each card of the hand.
   * @param score to display the total score of a player's hand.
   */
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
   * Displays the new card of the player.

   * @param card The card to display.
   * @param score total score of that player's hand.
   * @param hand the player's hand.
   */
  public void displayPlayerCard(model.Card card, int score, Iterable<Card> hand) {
    System.out.print("Player draws: ");
    displayCard(card);
    System.out.println();
  }

  /**
   * Displays the new card of the dealer.

   * @param card the card to display.
   * @param score total score of the dealer's hand
   * @param hand dealer hand.
   */
  public void displayDealerCard(model.Card card, int score, Iterable<Card> hand) {
    System.out.print("Dealer draws: ");
    displayCard(card);
    System.out.println();
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
