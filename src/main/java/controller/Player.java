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

   * @return False when the player wants to quit and selection() returns false.
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

    if (!checkStatus()) {
      return false;
    }

    showTable();
    view.displayMenu();

    int input = view.getInput();

    switch (input) {

      case 'h':
        game.hit();
        break;

      case 's':
        game.stand();
        showTable();
        break;

      case 'q':
        return input != 'q';

      default:
        break;
    }
    return true;
  }

  /**
   * Checks whether the game is running to customize the menu instruction messages.

   * @return true, if the game is running.
   */
  public boolean checkStatus() {

    if (!status) {
      view.newGameMessage();
      int input = view.getInput();

      if (input == 'p') {
        game.newGame();
        status = true;
        return true;
      } else if (input == 'q') {
        return false;
      }
    }
    return true;
  }

  public void showTable() {
    view.displayPlayerHand(game.getPlayerHand(), game.getPlayerScore());
    view.displayDealerHand(game.getDealerHand(), game.getDealerScore());
  }

  @Override
  public void playerNewCard(Card card) {
    view.displayPause();
    view.displayPlayerCard(card, game.getPlayerScore(), game.getPlayerHand());
  }

  @Override
  public void dealerNewCard(Card card) {
    view.displayPause();
    view.displayDealerCard(card, game.getDealerScore(), game.getDealerHand());
  }
}