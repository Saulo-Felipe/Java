import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Archives {
  public static String RegisterUser(String username, String password) {
    try {

      if (username.length() == 0)
        return "Nome de usuário inválido";

      else if (password.length() == 0)
        return "Senha inválida";

      FileWriter databaseWriter = new FileWriter("database.txt", true);

      databaseWriter.write(username + "," + password + ",0\n"); // <username>,<password>,<points>

      databaseWriter.close();

      return "Success";

    } catch(IOException e) {
      System.out.println("Erro ao abrir arquivos.");
      e.printStackTrace();
      return "Error";
    }
  }

  public static String deleteUser(String username) {
    try {
      File database = new File("database.txt");
      database.createNewFile();

      Scanner databaseReader = new Scanner(database);
      ArrayList<String> allUsers = new ArrayList<String>();

      while (databaseReader.hasNextLine()) {
        allUsers.add(databaseReader.nextLine());
      }

      databaseReader.close();

      // Delete user
      FileWriter databaseWriter = new FileWriter("database.txt");
      boolean userExists = false;

      for (String user : allUsers) {
        if (!user.split(",")[0].equals(username)) {
          databaseWriter.write(user+"\n");
        } else {
          System.out.println("Achei: "+user);
          userExists = true;
        }
      }

      databaseWriter.close();

      return !userExists ? "Usuário <"+username+"> não está cadastrado." : "Success";

    } catch(Exception e) {
      e.printStackTrace();
      return "Erro ao deletar usuário";
    }
  }

  public static String verifyLogin(String username, String password) {
    try {
      if (username.length() == 0) return "Usuário inválido.";
      else if (password.length() == 0) return "Senha inválida.";

      File database = new File("database.txt");
      database.createNewFile();
      Scanner databaseReader = new Scanner(database);
      boolean[] dataIsValid = {false, false};

      while (databaseReader.hasNextLine()) {
        String line = databaseReader.nextLine();

        if (line.split(",")[0].equals(username)) {
          dataIsValid[0] = true;

          if (line.split(",")[1].equals(password)) {
            dataIsValid[1] = true;
          } else {
            dataIsValid[1] = false;
          }

          break;
        }
      }

      databaseReader.close();

      if (dataIsValid[0] && dataIsValid[1]) {
        return "Success";
      }
      else if (!dataIsValid[0]) {
        return "Usuário não cadastrado, por favor, cadastre-o.";
      } else {
        return "Senha incorreta para <"+username+">";
      }

    } catch(Exception e) {
      e.printStackTrace();
      return "Erro ao verificar dados de login";
    }
  }

  public static void addOnePoint(String username) {
    try {
      File database = new File("database.txt");
      Scanner databaseReader = new Scanner(database);
      ArrayList<String> allLines = new ArrayList<String>();

      while (databaseReader.hasNextLine()) {
        String currentLine = databaseReader.nextLine();

        if (currentLine.split(",")[0].equals(username)) {
          int newPoint = Integer.parseInt(currentLine.split(",")[2]) + 1;

          currentLine = currentLine.split(",")[0] +","+ currentLine.split(",")[0] +","+ newPoint;
        }

        allLines.add(currentLine);
      }
      databaseReader.close();

      // Update archive
      FileWriter databaseWriter = new FileWriter("database.txt");

      for (String line: allLines) {
        databaseWriter.write(line+"\n");
      }

      databaseWriter.close();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
