package Ex02;

public class NewGame {
  public int[][] ticTacToe = new int[3][3];
  public int playerTurn = 2;
  public int hasWinner = 0;

  public void drawingUpdate() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(this.ticTacToe[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println(); // Jogo teste
    // -----------------------------------------------------

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
}
