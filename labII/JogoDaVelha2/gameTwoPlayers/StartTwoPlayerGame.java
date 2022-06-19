package JogoDaVelha2.gameTwoPlayers;

import JogoDaVelha2.*;

public class StartTwoPlayerGame {
  Tools tools = new Tools();
  ShowOnScreen showOnScreen = new ShowOnScreen();
  Input input = new Input();

  public void start() {
    NewGame game = new NewGame();

    //game.drawingUpdate();

    while (game.hasWinner == 0) { // Loop de uma partida
      System.out.print("\033[H\033[2J");
      showOnScreen.userHeader();
      System.out.println("-----------------------------");
      game.drawingUpdate();

      game.playerTurn = game.playerTurn == 2 ? 1 : 2;

      int[] lineAndColumn = game.getGameEntry(game.playerTurn, game.ticTacToe);

      game.ticTacToe[lineAndColumn[0]-1][lineAndColumn[1]-1] = game.playerTurn;

      game.hasWinner = game.verifyWinner();

      if (game.verifyDraw()) {
        System.out.println("EMPATE!");
        return;
      }

    }

    if (game.hasWinner != 0) {
      System.out.printf(
        "\nO JOGADOR %s (%c) VENCEU!\n", 
        this.tools.getAuthenticatedUer()[game.hasWinner == 1 ? 1 : 3],  
        game.hasWinner == 1 ? 'X' : 'O'
      );

      this.tools.newPoint(game.hasWinner);

      System.out.println("\nContinuar jogando?");
      this.showOnScreen.yesOrNotMenu();

      int option = this.input.getIntWithoutError("-> Sua opção: ", 2);

      if (option == 1) {
        this.start();
      } else {
        this.showOnScreen.homeMenu();
      }
    }
  }

  public void keepPlaying() {

  }

}
