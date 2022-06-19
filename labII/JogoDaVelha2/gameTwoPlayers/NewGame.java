package JogoDaVelha2.gameTwoPlayers;

import java.util.Scanner;

import JogoDaVelha2.Tools;

public class NewGame {
  public int[][] ticTacToe = new int[3][3];
  public int playerTurn = 2;
  public int hasWinner = 0;
  public Scanner input = new Scanner(System.in);
  public Tools tools = new Tools();


  public void drawingUpdate() {
    System.out.println("   1   2   3"); // Positions

    for (int i = 1; i < 7; i++) {

      if (i%2 == 1 && i < 6) {
        System.out.print(i/2+1);
        System.out.print("  "+(this.ticTacToe[i/2][0] == 1 ? "X" : this.ticTacToe[i/2][0] == 2 ? "O" : " "));
        System.out.print(" | "); // Positions
      }
      else {
        System.out.print((this.ticTacToe[i/2-1][1] == 1 ? "X" : this.ticTacToe[i/2-1][1] == 2 ? "O" : " "));
        System.out.print(" | ");
        System.out.print((this.ticTacToe[i/2-1][2] == 1 ? "X" : this.ticTacToe[i/2-1][2] == 2 ? "O" : " "));
      }

      if (i == 2 || i == 4)
        System.out.print("\n  -----------\n");
    }
    System.out.println("\n");
  }

  public int verifyWinner() {
    for (int i = 0; i < 3; i++) {

      // Horizontal
      if ((this.ticTacToe[i][0] != 0) && this.ticTacToe[i][0] == this.ticTacToe[i][1] && this.ticTacToe[i][0] == this.ticTacToe[i][2]) {
        return this.ticTacToe[i][0];
      }

      // Vertical
      if ((this.ticTacToe[0][i] != 0) && this.ticTacToe[0][i] == this.ticTacToe[1][i] && this.ticTacToe[0][i] == this.ticTacToe[2][i]) {
        return this.ticTacToe[0][i];
      }

      // Diagonal
      if ((this.ticTacToe[0][0] != 0) && this.ticTacToe[0][0] == this.ticTacToe[1][1] && this.ticTacToe[0][0] == this.ticTacToe[2][2]) {
        return this.ticTacToe[0][0];
      }

      // Transversal
      if ((this.ticTacToe[0][2] != 0) && this.ticTacToe[0][2] == this.ticTacToe[1][1] && this.ticTacToe[0][2] == this.ticTacToe[2][0]) {
        return this.ticTacToe[0][2];
      }
    }

    return 0;
  }

  public boolean verifyDraw() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (this.ticTacToe[i][j] == 0) {
          return false;
        }
      }
    }

    return true;
  }

  public int[] getGameEntry(int playerTurn, int[][] ticTacToe) {
    System.out.print("======| Vez de "+this.tools.getAuthenticatedUer()[playerTurn == 1 ? 1 : 3]+" |=====\n");
    int[] lineAndColumn = {0, 0};
    int init = 0;
    
    while (init == 0 || !verifyEntry(lineAndColumn, ticTacToe)) {      
      System.out.print("Linha: ");
      lineAndColumn[0] = input.nextInt();
  
      System.out.print("Coluna: ");
      lineAndColumn[1] = input.nextInt();

      init = 1;
    }
    
    return lineAndColumn;
  }

  public boolean verifyEntry(int[] lineAndColumn, int[][] ticTacToe) {
    if ((lineAndColumn[0] < 1 || lineAndColumn[1] < 1) || (lineAndColumn[0] > 3 || lineAndColumn[1] > 3)) {
      System.out.println("Posição inválida!");
      return false;
    }
    else if (ticTacToe[lineAndColumn[0]-1][lineAndColumn[1]-1] != 0) {
      System.out.println("Posição ocupada");
      return false;
    }

    return true;
  }
}
