package JogoDaVelha2;

public class ShowOnScreen {


  public void homeMenu() {
    System.out.print("\033[H\033[2J");
    System.out.print(
      "|---------< JOGAR >---------|\n"+
      "\n[1] Um jogador\n"+
      "[2] Dois jogadores\n"
    );
  }

  public void yesOrNotMenu() {
    System.out.print(
      "[1] Sim\n"+
      "[2] Não\n"
    );
  }
}
