package Ex02;
import java.util.Scanner;

public class Input {
  Scanner input = new Scanner(System.in);

  public int[] getGameEntry(int playerTurn, int[][] ticTacToe) {
    System.out.print("======| Vez do jogador "+playerTurn+" |=====\n");
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
