package JogoDaVelha2;

import java.util.Scanner;

public class Input {
  private Scanner scanner;
  private Tools tools = new Tools();

  public String getSinglePlayerUsername() {
    this.scanner = new Scanner(System.in);

    System.out.print("\nDigite o nome de usuário: ");
    String username = this.scanner.nextLine();

    return username;
  }

  public int getIntWithoutError(String label, int optionsLimitIndex) {
    this.scanner = new Scanner(System.in);
    int value = 0;

    mainLoop:
    while (true) {
      try {
        System.out.print(label);

        value = Integer.parseInt(this.scanner.nextLine());

        for (int i = 1; i < optionsLimitIndex+1; i++) {
          if (value == i) {
            break mainLoop;
          }
        }

        throw new Exception();

      } catch(Exception e) {
        this.tools.showAlertMessage("Opção inválida. Tente novamente!");
      }
    }
    
    return value;
  }
}
