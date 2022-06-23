import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class MenuOptions {
  public static void Home() {
    try {

      String[] options = {
        "Iniciar jogo",
        "Cadastrar usuário",
        "Deletar usuário",
        "Sair do jogo"
      };

      String option = (String)JOptionPane.showInputDialog(
        null,
        "Selecione uma opção: ",
        "Menu",
        JOptionPane.OK_CANCEL_OPTION,
        null,
        options,
        options[0]
      );

      switch (option) {
        case "Iniciar jogo":
          MenuOptions.SelectGameMode();
          break;

        case "Cadastrar usuário":
          MenuOptions.RegisterUser();
          break;

        case "Deletar usuário":
          MenuOptions.DeleteUser();
          break;

        default:
          break;
      }

    } catch(Exception e) {
      System.out.println("Saindo...");
    }

    System.out.println("Saindo...");
  }

  public static void RegisterUser() {
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    boolean exit = false;

    while (!exit) {
      Object[] message = {
        "Nome de usuário:", username,
        "Senha:", password,
      };

      int option = JOptionPane.showConfirmDialog(null, message, "Cadastro de usuário", JOptionPane.OK_CANCEL_OPTION);

      if (option == JOptionPane.OK_OPTION) {
        String logs = Archives.RegisterUser(username.getText(), String.valueOf(password.getPassword()));

        if (logs.equals("Success")) {
          MenuOptions.showMessage("Usuário cadastrado com sucesso!");
          exit = true;

        } else {
          MenuOptions.showMessage(logs);
        }

      } else {
        exit = true;
      }
    }

    MenuOptions.Home();
  }

  public static void DeleteUser() {
    boolean exit = false;

    while (!exit) {
      String username = JOptionPane.showInputDialog(null, "Usuário a ser deletado: ", "Remoção de usuário", JOptionPane.INFORMATION_MESSAGE);

      if (username == null) exit = true;

      else {
        if (username.length() == 0) {
          MenuOptions.showMessage("usuário inválido");
        } else {
          String logs = Archives.deleteUser(username);

          if (logs.equals("Success")) {
            MenuOptions.showMessage("Usuário <"+username+"> deletado com sucesso!");
            exit = true;

          } else {
            MenuOptions.showMessage(logs);
          }
        }
      }
    }

    MenuOptions.Home();
  }

  public static void SelectGameMode() {
    Object[] modes = {
      "Dois jogadores",
      "Contra máquina (Inteligente)",
      "Contra máquina (burra)",
    };

    String option = (String)JOptionPane.showInputDialog(
      null,
      "Selecione o modo de jogo",
      "Jogos disponíveis",
      JOptionPane.OK_CANCEL_OPTION,
      null,
      modes,
      modes[0]
    );

    switch (option) {
      case "Dois jogadores":
        MenuOptions.TwoPlayersLogin();
        break;

      case "Contra máquina (Inteligente)":

        break;

      case "Contra máquina (burra)":

        break;


      default:
        break;
    }

  }

  public static class User {
    User(String name, String password) {
      this.username = name;
      this.password = password;
    }

    public String username = "";
    public String password = "";
  }

  public static void TwoPlayersLogin() {
    ArrayList<User> twoPlayersList = new ArrayList<User>();
    String action = "";

    PickTwoPlayers:
    for (int i = 0; i < 2; i++) {
      boolean isValidValues = false;

      JTextField usernameTextField = new JTextField();
      JPasswordField passwordTextField = new JPasswordField();

      Object[] message = {
        "Nome de usuário:", usernameTextField,
        "Senha:", passwordTextField,
      };

      while (!isValidValues) {
        int option = JOptionPane.showConfirmDialog(null, message, i == 0 ? "Primeiro jogador" : "Segundo jogador", JOptionPane.OK_CANCEL_OPTION);

        if (option == 0) { // Ok option
          if (usernameTextField.getText().length() == 0) {
            MenuOptions.showMessage("Usuário inválido.");
          } else if (passwordTextField.getPassword().length == 0) {
            MenuOptions.showMessage("Senha inválida.");
          } else {
            if (i == 0)
              MenuOptions.showMessage("Tudo ok, agora entre com o 2º player.");
            User newUser = new User(
              usernameTextField.getText(), 
              String.valueOf(passwordTextField.getPassword())
            );
            twoPlayersList.add(newUser);
            break;
            // Init game
          }
        } else { // Cancel option
          action = "Cancel";
          break PickTwoPlayers;
        }
      }
      
      if (action.equals("Cancel"))
        MenuOptions.Home();
    }

    // Start the game here kk
    for (User user: twoPlayersList) {
      System.out.println(user.username);
      System.out.println(user.password);
    }


  }



  public static void showMessage(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}
