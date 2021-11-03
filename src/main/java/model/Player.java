package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Represents a player in the Black Jack game. A Player has a hand of cards.
 */
public class Player implements Cloneable {
  private List<Card.Mutable> hand;
  protected final int maxScore = 21;
  ArrayList<NewCardObserver> subscribers;

  public Player() {
    hand = new LinkedList<Card.Mutable>();
    subscribers = new ArrayList<>();
  }

  /**
   * notifies subscribers for the observer pattern.

   * @param card to keep track of what the new given out card is.
   * @param n distinguishes whether it is the dealer or the player.
   */
  public void notifySubscribers(Card card, int n) {
    if (n == 1) {
      for (NewCardObserver s : subscribers) {
        s.playerNewCard(card);
      }
    } else if (n == 2) {
      for (NewCardObserver s : subscribers) {
        s.dealerNewCard(card);
      }
    }
  }

  public void addSubscriber(NewCardObserver s) {
    subscribers.add(s);
  }

  public void removeSubscriber(NewCardObserver s) {
    subscribers.remove(s);
  }
  /**
   * Adds a card to the Player's hand. 

   * @param addToHand The card to add to the hand.
   */
  public void dealCard(Card.Mutable addToHand) {
    hand.add(addToHand);
  }

  /**
   * Returns the cards in thand.

   * @return the cards in the Player's hand
   */
  public Iterable<Card> getHand() {
    return new LinkedList<Card>(hand);
  }

  /**
   * Removes all cards from the hand.
   */
  public void clearHand() {
    hand.clear();
  }

  /**
   * Shows all cards in the hand.
   */
  public void showHand() {
    for (Card.Mutable c : hand) {
      c.show(true);
    }
  }

  /**
   * Calculates the score of the hand according to Black Jack rules.

   * @return The score.
   */
  public int calcScore() {
    // the number of scores is dependant on the number of scorable values
    // as it seems there is no way to do this check at compile time in java ?!
    // cardScores[13] = {...};
    int[] cardScores = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11 };
    assert (cardScores.length == Card.Value.Count.ordinal())
        : "Card Scores array size does not match number of card values";

    int score = 0;

    for (Card c : getHand()) {
      if (c.getValue() != Card.Value.Hidden) {
        score += cardScores[c.getValue().ordinal()];
      }
    }

    if (score > maxScore) {
      for (Card c : getHand()) {
        if (c.getValue() == Card.Value.Ace && score > maxScore) {
          score -= 10;
        }
      }
    }

    return score;
  }

  /**
   * It is the players turn. Was implemented to distinguish between player and dealer when notifying subscribers.

   */
  public void playerTurn(Deck deck, Player player, boolean bool) {
    Card.Mutable c;
    c = deck.getCard();
    c.show(bool);
    player.dealCard(c);
    notifySubscribers(c, 1);
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
