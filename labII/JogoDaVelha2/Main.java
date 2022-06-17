package JogoDaVelha2;

public class Main {
  public static ShowOnScreen showOnScreen = new ShowOnScreen();
  public static Input input = new Input();
  public static Authentication authentication = new Authentication();

  public static void main(String[] args) {

    showOnScreen.homeMenu(); // Show menu

    int homeOption = input.getIntWithoutError("\n-> Sua opção: ", 3);

    if (homeOption == 1) { // Single player
      authentication.singlePlayerAuth();

    } else if (homeOption == 2) {
      
    }
  }


}
