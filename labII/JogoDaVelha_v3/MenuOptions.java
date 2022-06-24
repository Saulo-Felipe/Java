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
    try {
      Object[] modes = {
        "Dois jogadores",
        "Contra máquina (Inteligente)",
        "Contra máquina (burra)",
      };
  
      String option = (String)JOptionPane.showInputDialog(
        null,
        "Selecione o modo de jogo",
        "Jogos disponíveis",
        JOptionPane.INFORMATION_MESSAGE,
        null,
        modes,
        modes[0]
      );
  
      System.out.println("Su optin: " + option);
      
      if (option.equals("Dois jogadores")) {
        MenuOptions.TwoPlayersLogin();
        System.out.println("option 1");
      }
  
      else if (option.equals("Contra máquina (Inteligente)")) {
        System.out.println("option 2");
      }
  
      else if (option.equals("Contra máquina (burra)")) {
        System.out.println("option 3");
  
      } else {
        System.out.println("option 4");
        MenuOptions.Home();
  
      }

    } catch(Exception e) {
      MenuOptions.Home();
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
          String username = usernameTextField.getText();
          String password = String.valueOf(passwordTextField.getPassword());

          String logs = Archives.verifyLogin(username, password);

          if (logs.equals("Success")) {

            if (i == 1 && username.equals(twoPlayersList.get(0).username)) {
              MenuOptions.showMessage("O nome de usuário <"+username+"> já foi usado pelo jogador 1.");
            } else {
              twoPlayersList.add(new User(
                username, 
                password
              ));

              isValidValues = true;
            }

          } else {
            MenuOptions.showMessage(logs);
          }

        } else { // Cancel option
          action = "Cancel";
          break PickTwoPlayers;
        }
      }
      
    }

    if (action.equals("Cancel"))
      MenuOptions.SelectGameMode();

    GameTwoPlayers.start(twoPlayersList.get(0).username, twoPlayersList.get(1).username);

  }

  public static boolean keepPlaying() {
    try {
      Object[] options = {
        "Não :(",
        "Simmm :D"
      };

      int option = JOptionPane.showOptionDialog(
        null,
        "Deseja continuar jogando?",
        "Fim de jogo",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[1]
      );

      if (option == 1)
        return true;
      else 
        return false;
      
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    } 
  }

 
  public static void showMessage(String message) {
    JOptionPane.showMessageDialog(null, message);
  }

}
