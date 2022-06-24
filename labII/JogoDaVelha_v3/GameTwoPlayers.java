import java.util.Scanner;


public class GameTwoPlayers {
  public static int[][] ticTacToe = new int[3][3];
  public static int playerTurn = 2;
  public static Scanner input = new Scanner(System.in);
  public static int hasWinner = 0;


  public static void start(String username1, String username2) {

    while (hasWinner == 0) {
      System.out.print("\033[H\033[2J"); // Clean screen

      System.out.println(username1.toUpperCase() +" vs "+ username2.toUpperCase());

      drawingUpdate();

      playerTurn = playerTurn == 2 ? 1 : 2;

      int[] lineAndColumn = getGameEntry();

      ticTacToe[lineAndColumn[0]-1][lineAndColumn[1]-1] = playerTurn;

      hasWinner = verifyWinner();

      if (verifyDraw()) {
        System.out.println("EMPATE!");
        return;
      }
    }

    boolean winnerOption = hasWinner == 1;

    Archives.addOnePoint(winnerOption ? username1 : username2);

    MenuOptions.showMessage(
      "\nO JOGADOR "+(winnerOption ? username1 + " [X] " : username2 + " [O] ")+"VENCEU!\n"
    );

    boolean keepPlaying = MenuOptions.keepPlaying();

    if (keepPlaying) {
      GameTwoPlayers.restart();
      GameTwoPlayers.start(username1, username2);
    }
    else 
      MenuOptions.Home();
  }


  public static void drawingUpdate() {
    System.out.println("   1   2   3"); // Positions

    for (int i = 1; i < 7; i++) {

      if (i%2 == 1 && i < 6) {
        System.out.print(i/2+1);
        System.out.print("  "+(ticTacToe[i/2][0] == 1 ? "X" : ticTacToe[i/2][0] == 2 ? "O" : " "));
        System.out.print(" | "); // Positions
      }
      else {
        System.out.print((ticTacToe[i/2-1][1] == 1 ? "X" : ticTacToe[i/2-1][1] == 2 ? "O" : " "));
        System.out.print(" | ");
        System.out.print((ticTacToe[i/2-1][2] == 1 ? "X" : ticTacToe[i/2-1][2] == 2 ? "O" : " "));
      }

      if (i == 2 || i == 4)
        System.out.print("\n  -----------\n");
    }
    System.out.println("\n");
  }

  public static int verifyWinner() {
    for (int i = 0; i < 3; i++) {

      // Horizontal
      if ((ticTacToe[i][0] != 0) && ticTacToe[i][0] == ticTacToe[i][1] && ticTacToe[i][0] == ticTacToe[i][2]) {
        return ticTacToe[i][0];
      }

      // Vertical
      if ((ticTacToe[0][i] != 0) && ticTacToe[0][i] == ticTacToe[1][i] && ticTacToe[0][i] == ticTacToe[2][i]) {
        return ticTacToe[0][i];
      }

      // Diagonal
      if ((ticTacToe[0][0] != 0) && ticTacToe[0][0] == ticTacToe[1][1] && ticTacToe[0][0] == ticTacToe[2][2]) {
        return ticTacToe[0][0];
      }

      // Transversal
      if ((ticTacToe[0][2] != 0) && ticTacToe[0][2] == ticTacToe[1][1] && ticTacToe[0][2] == ticTacToe[2][0]) {
        return ticTacToe[0][2];
      }
    }

    return 0;
  }

  public static boolean verifyDraw() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (ticTacToe[i][j] == 0) {
          return false;
        }
      }
    }

    return true;
  }

  public static int[] getGameEntry() {
    System.out.print("======| Vez de "+(playerTurn==1 ? "X" : "O")+" |=====\n");
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

  public static boolean verifyEntry(int[] lineAndColumn, int[][] ticTacToe) {
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

  public static void restart() {
    ticTacToe = new int[3][3];
    playerTurn = 2;
    hasWinner = 0;
  }
}