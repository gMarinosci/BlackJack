package controller;

import model.Game;
import model.rules.AmericanRulesFactory;
import view.EnglishView;
import view.View;

/**
 * Starts the application using the console.
 */
public class App {
  /**
   * Starts the game.

  * @param args Not used.
  */
  public static void main(String[] args) {


    Player ctrl = null;
    try {
      ctrl = new Player(new AmericanRulesFactory());
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    try {
      while (ctrl.play()) {

      }
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
}