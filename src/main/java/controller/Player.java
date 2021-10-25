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
  boolean status;

  Player() {
    game = new Game();
    view = new EnglishView();
    game.getPlayer().addSubscriber(this);
    game.getDealer().addSubscriber(this);
    status = false;
  }
  /**
   * Runs the play use case.

   * @return True as long as the game should continue.
   */
  public boolean play() {
    view.displayWelcomeMessage();

    while (selection()) {

    }

    return false;
  }

  /**
   * Handles the player's decisions.
   *
   * @return false if the player wants to quit.
   */
  public boolean selection() {

    if (game.isGameOver()) {
      view.displayGameOver(game.isDealerWinner());
      status = false;
    }

    if (!status) {
      view.newGameMessage();
      int input = view.getInput();

      if (input == 'p') {
        game.newGame();
        status = true;
      } else if(input == 'q') {
        return false;
      }
    }

    view.displayMenu();

    int input = view.getInput();

    switch (input) {

      case 'h':
        game.hit();
        break;

      case 's':
        game.stand();
        break;

      case 'q':
        return input != 'q';

      default:
        break;
    }
    return true;
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