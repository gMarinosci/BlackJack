package model.rules;

import model.Card;
import model.Player;

public class Soft17HitStrategy implements HitStrategy{
  private static final int hitLimit = 17;

  public boolean doHit(Player dealer) {

    for (Card temp : dealer.getHand()) {
      if (temp.getValue().equals(Card.Value.Ace) && dealer.calcScore() == hitLimit) {
        return dealer.calcScore() - 10 < hitLimit;
      }
    }
    return dealer.calcScore() < hitLimit;
  }

  @Override
  public void accept(HitRuleVisitor visitor) {
    visitor.visit(this);
  }
}
