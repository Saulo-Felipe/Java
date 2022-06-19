package JogoDaVelha2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Authentication {
  private Input input = new Input();
  private Tools tools = new Tools();
  private ShowOnScreen showOnScreen = new ShowOnScreen();

  public void singlePlayerAuth() {
    String username = this.input.getSinglePlayerUsername();
    String[] ItIsRegistered = this.tools.searchUsername(username);

    if (ItIsRegistered[0].equals("Not Found")) {
      System.out.println("\nUsuário não cadastrado. Deseja cadastra-lo? ");

      this.showOnScreen.yesOrNotMenu();

      int registerOption = this.input.getIntWithoutError("\n-> Sua opção: ", 2);

      if (registerOption == 1) {
        this.register(username);
        String[] user = {username, "0"};
        this.tools.setIsAuthenticated("Contra a máquina", user);
        this.showOnScreen.homeMenu(); // Iniciar o jogo
      } else {
        showOnScreen.homeMenu(); // Correto
      }
    } else { // Iniciar jogo contra maquina
      String[] user = {ItIsRegistered[0], ItIsRegistered[1]};
      this.tools.setIsAuthenticated("Contra a máquina", user);
      // Iniciar o jogo
      this.showOnScreen.homeMenu();
    }
  }

  public void twoPlayersAuth() {
    String[] users = this.input.getTwoPlayersUsername();
    String[] authenticateInfo = {"", "", "", ""};

    for (int c = 0; c < 2; c++) {
      String[] ItIsRegistered = this.tools.searchUsername(users[c]);

      if (ItIsRegistered[0].equals("Not Found")) {
        System.out.println("\nUsuário <"+users[c]+"> não cadastrado. Deseja cadastra-lo? ");

        this.showOnScreen.yesOrNotMenu();

        int registerOption = this.input.getIntWithoutError("\n-> Sua opção: ", 2);

        if (registerOption == 1) {
          this.register(users[c]);

          if (c == 0) {
            authenticateInfo[0] = users[0];
            authenticateInfo[1] = "0";
          } else {
            authenticateInfo[2] = users[1];
            authenticateInfo[3] = "0";
          }

        } else {
          this.showOnScreen.homeMenu(); // COrreto 
        }
      } else {
        if (c == 0) {
          authenticateInfo[0] = ItIsRegistered[0];
          authenticateInfo[1] = ItIsRegistered[1];
        } else {
          authenticateInfo[2] = ItIsRegistered[0];
          authenticateInfo[3] = ItIsRegistered[1];
        }
      }
    }

    this.tools.setIsAuthenticated("Dois jogadores", authenticateInfo);
    this.showOnScreen.homeMenu();
  }

  public void register(String username) {
    try {
      // Read database
      File file = new File("database.txt");
      Scanner scann = new Scanner(file);

      String fileNames = "";

      while (scann.hasNextLine()) {
        fileNames += scann.nextLine()+"\n"+scann.nextLine()+"\n";
      }

      // edit database
      FileWriter fileWriter = new FileWriter("database.txt");

      fileWriter.write(
        fileNames + username + "\n" + 0 + "\n"
      );

      this.tools.showAlertMessage("Usuário <"+username+"> registrado com sucesso! Escolha o nome de usuario no menu principal.");

      scann.close();
      fileWriter.close();
    } catch(FileNotFoundException e) {
      this.tools.showAlertMessage("Erro ao editar arquivo txt");
    } catch(Exception e) {
      this.tools.showAlertMessage("Erro ao salvar arquivo de database.");
    }
  }

  public void logout() {
    try {

      File file = new File("gameInfo.txt");
      FileWriter fileWriter = new FileWriter(file);

      fileWriter.write("");
      fileWriter.close();

      showOnScreen.homeMenu();

    } catch(FileNotFoundException e) {
      this.tools.showAlertMessage("Erro ao sair da conta.");
    } catch(Exception e) {
      this.tools.showAlertMessage("Erro ao sair da conta.");
    }
  }
}
