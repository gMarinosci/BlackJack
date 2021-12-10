package view;

import model.Card;

/**
 * Encapsulates the generic view functionality.
 */
public abstract class ViewBase implements View {

  /**
   * Shows a welcome message.
   */

  public void displayCard(model.Card card) {
    System.out.println("" + card.getValue() + " of " + card.getColor());
  }

  /**
   * Displays hand.

   * @param name Either dealer or player.
   * @param hand all cards.
   * @param score total score.
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

  /**
   * Displays the cad of the dealer.

   * @param card newest card.
   * @param score total score.
   * @param hand all cards.
   */
  public void displayDealerCard(model.Card card, int score, Iterable<Card> hand) {
    System.out.print("Dealer draws: ");
    displayCard(card);
    System.out.println();
  }
}