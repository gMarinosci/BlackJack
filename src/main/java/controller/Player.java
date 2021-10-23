package controller;

import model.Card;
import model.Game;
import view.EnglishView;
import view.View;


/**
 * Scenario controller for playing the game.
 */
public class Player implements model.NewCardObserver {
  Game game;
  View view;

  Player() {
    game = new Game();
    view = new EnglishView();
    game.getPlayer().addSubscriber(this);
    game.getDealer().addSubscriber(this);
  }
  /**
   * Runs the play use case.

   * @return True as long as the game should continue.
   */
  public boolean play() {
    view.displayWelcomeMessage();

    if (game.isGameOver()) {
      view.displayGameOver(game.isDealerWinner());
    }

    int input = view.getInput();

    if (input == 'p') {
      game.newGame();
    } else if (input == 'h') {
      game.hit();
    } else if (input == 's') {
      game.stand();
    }

    return input != 'q';
  }

  @Override
  public void playerNewCard(Card card) {
    view.displayPlayerCard(card, game.getPlayerScore(), game.getPlayerHand());
  }

  @Override
  public void dealerNewCard(Card card) {
    view.displayDealerCard(card, game.getDealerScore(), game.getDealerHand());
  }
}