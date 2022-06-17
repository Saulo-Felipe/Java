package JogoDaVelha2;

public class Authentication {
  private Input input = new Input();
  private Tools tools = new Tools();
  private ShowOnScreen showOnScreen = new ShowOnScreen();

  public void singlePlayerAuth() {
    String username = this.input.getSinglePlayerUsername();
    String ItIsRegistered = this.tools.searchUsername(username);

    if (ItIsRegistered.equals("Not Found")) {
      System.out.println("\nUsuário não cadastrado. Deseja cadastra-lo? ");

      this.showOnScreen.yesOrNotMenu();

      int registerOption = this.input.getIntWithoutError("\n-> Sua opção: ", 2);

      if (registerOption == 1) {
        this.register(username);
      } else {
        showOnScreen.homeMenu();
      }
    } else {
      System.out.println("Logado com sucesso!");
    }
  }

  public void twoPlayersAuth() {

  }

  public void register(String username) {
    // Registrar usuario
  }
}
