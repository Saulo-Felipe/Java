package JogoDaVelha2;

import JogoDaVelha2.gameTwoPlayers.StartTwoPlayerGame;

public class ShowOnScreen {
  public static Input input = new Input();
  public static Authentication authentication = new Authentication();
  public static Tools tools = new Tools();
  public static StartTwoPlayerGame startTwoPlayerGame = new StartTwoPlayerGame();

  public void homeMenu() {
    System.out.print("\033[H\033[2J");

    this.userHeader();

    System.out.print(
      "|---------< JOGAR >---------|\n"+
      "\n[1] Um jogador\n"+
      "[2] Dois jogadores\n"
    );

    if (tools.isAuthenticated())
      System.out.println("[3] Sair da conta");

    int homeOption = input.getIntWithoutError(
      "\n-> Sua opção: ",
      tools.isAuthenticated() ? 3 : 2
    );

    if (homeOption == 3) { // Logout
      authentication.logout();
    }

    if (tools.isAuthenticated()) {
      if (tools.getAuthenticatedUer()[0].equals("Contra a máquina") && homeOption == 2)
        authentication.twoPlayersAuth();

      else
        startTwoPlayerGame.start();
      
    } else {
      if (homeOption == 1) { // Single player
        authentication.singlePlayerAuth();
  
      } else if (homeOption == 2) { // two players
        authentication.twoPlayersAuth();
  
      }
    }
    
    // Inicia o jogo
    if (tools.getAuthenticatedUer()[0].equals("Contra a máquina") && homeOption == 2)
      authentication.twoPlayersAuth();

  }

  public void userHeader() {
    if (tools.isAuthenticated()) {
      System.out.println("Autenticado ☑️");

      System.out.printf(
        "Usuário 1: %10s - "+
        "Pontos: %s\n"+
        "Usuário 2: %10s - "+
        "Pontos: %s\n",
        tools.getAuthenticatedUer()[1],
        tools.getAuthenticatedUer()[2],
        tools.getAuthenticatedUer()[0].equals("Dois jogadores") ? tools.getAuthenticatedUer()[3] : "Máquina",
        tools.getAuthenticatedUer()[0].equals("Dois jogadores") ? tools.getAuthenticatedUer()[4] : "0"
      );
    }

  }

  public void yesOrNotMenu() {

    System.out.print(
      "[1] Sim\n"+
      "[2] Não\n"
    );
  }
}
