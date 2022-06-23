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
}
