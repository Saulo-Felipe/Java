/*
 * DUPLA:
 *
 * -> SAULO JOSÉ FELIPE
 * ->
*/

package Ex02;

class Main {
  public static void main(String[] args) {
    public NewGame game = new NewGame();
    public Input input = new Input();

    game.drawingUpdate();


    while (game.hasWinner == 0) {
      game.playerTurn = game.playerTurn == 2 ? 1 : 2;

      int[] lineAndColumn = input.getGameEntry(game.playerTurn, game.ticTacToe);

      game.ticTacToe[lineAndColumn[0]-1][lineAndColumn[1]-1] = game.playerTurn;

      game.hasWinner = game.verifyWinner();

      if (game.verifyDraw()) {
        System.out.println("EMPATE!");
        return;
      }

      game.drawingUpdate();
    }

    if (game.hasWinner != 0)
      System.out.printf("\nO JOGADOR %d (%c) VENCEU!\n", game.hasWinner, game.hasWinner == 1 ? 'X' : 'O');
  }
}
