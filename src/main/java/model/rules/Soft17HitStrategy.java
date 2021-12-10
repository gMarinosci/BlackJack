package model.rules;

import model.Card;
import model.Player;
import view.EnglishRulesVisitor;

/**
 * Describes the hit behaviour of the dealer.
 */
public class Soft17HitStrategy implements HitStrategy {
  private static final int hitLimit = 17;

  /**
   * Soft 17 means that the dealer has 17 but in a combination of Ace and 6 (for example Ace, two, two, two).
   * This means that the Dealer can get another card valued at 10 but still have 17 as the value of the ace
   * is reduced to 1. Using the soft 17 rule the dealer should take another card
   * (compared to the original rule when the dealer only takes cards on a score of 16 or lower).

   * @param dealer the player to check.
   * @return false if the dealer should stand.
   */
  public boolean doHit(Player dealer) {

    for (Card temp : dealer.getHand()) {
      if (temp.getValue().equals(Card.Value.Ace) && dealer.calcScore() == hitLimit) {
        return dealer.calcScore() - 10 < hitLimit;
      }
    }
    return dealer.calcScore() < hitLimit;
  }

  @Override
  public void accept(EnglishRulesVisitor visitor) {
    visitor.visit(this);
  }
}
