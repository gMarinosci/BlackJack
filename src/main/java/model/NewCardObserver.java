package model;

/**
 * Interface to implement the observer pattern and add a pause after every new card.
 */
public interface NewCardObserver {
  void newCard(Card card);
}
