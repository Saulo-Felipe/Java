package JogoDaVelha2;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOError;

public class Tools {
  private Scanner input;
  private File file;

  public void showAlertMessage(String message) {
    JOptionPane.showMessageDialog(null, message);
  }

  public String[] searchUsername(String username) {
    String[] user = {"Not Found", "0"};
    try {
      this.file = new File("database.txt");
      this.file.createNewFile();
      this.input = new Scanner(this.file);

      while (input.hasNextLine()) {
        String temporaryName = input.nextLine();
        String temporaryPoints = input.nextLine();

        if (temporaryName.equals(username)) {
          user[0] = temporaryName;
          user[1] = temporaryPoints;

          return user;
        }
      }

    } catch(Exception e) {
      this.showAlertMessage("Ocorreu um erro ao tentar abrir arquivo.");
    }

    return user;
  }

  public void setIsAuthenticated(String gameMode, String[] usernames) {
    try {
      File file = new File("gameInfo.txt");
      FileWriter fileWriter = new FileWriter(file);
      
      fileWriter.write(gameMode);
      
      if (gameMode.equals("Contra a máquina")) {
        fileWriter.write("\n"+usernames[0]);
        fileWriter.write("\n"+usernames[1]);

      } else {
        for (int i = 0; i < 4; i++) {
          fileWriter.write("\n"+usernames[i]);
        }
      }

      fileWriter.close();
    } catch(FileNotFoundException e) {
      this.showAlertMessage("Erro ao editar arquivo txt");
    } catch(Exception e) {
      this.showAlertMessage("Erro ao salvar arquivo de database.");
    }

  }
  
  public String[] getAuthenticatedUer() {
    String[] gameInfo = {"", "", "", "", ""};

    try {
      File file = new File("gameInfo.txt");
      this.input = new Scanner(file);

      for (int i = 0; this.input.hasNextLine(); i++) {
        gameInfo[i] = this.input.nextLine();
      }

      this.input.close();
      return gameInfo;

    } catch(FileNotFoundException e) {
      this.showAlertMessage("Erro ao editar arquivo txt");
    } catch(Exception e) {
      this.showAlertMessage("Erro ao salvar arquivo de login.");
    }

    return gameInfo;
  }

  public boolean isAuthenticated() {
    try {
      File file = new File("gameInfo.txt");
      this.input = new Scanner(file);

      while (this.input.hasNextLine()) {
        return true;
      }

      this.input.close();
      return false;

    } catch(FileNotFoundException e) {
      this.showAlertMessage("Erro ao editar arquivo txt");
    } catch(Exception e) {
      this.showAlertMessage("Erro ao salvar arquivo de login.");
    }

    return false;
  }

  public void newPoint(int userIndex) {
    try {

      File file = new File("database.txt");
      Scanner scann = new Scanner(file);
      String username = this.getAuthenticatedUer()[userIndex == 1 ? 1 : 3];

      String fileNames = "";

      while (scann.hasNextLine()) {
        String name = scann.nextLine();
        int points = Integer.parseInt(scann.nextLine()); 

        if (username.equals(name)) {
          points += 1;
        }

        fileNames += name+"\n"+points+"\n";
      }

      // edit archvie
      FileWriter fileWriter = new FileWriter("database.txt");

      fileWriter.write(fileNames);

      String[] loggedUsers = {
        this.getAuthenticatedUer()[1], 
        this.getAuthenticatedUer()[2], 
        this.getAuthenticatedUer()[3],
        this.getAuthenticatedUer()[4], 

      };
      this.setIsAuthenticated(this.getAuthenticatedUer()[0], loggedUsers);

      scann.close();
      fileWriter.close();
    } catch(FileNotFoundException e) {
      this.showAlertMessage("Erro ao editar arquivo txt");
    } catch(Exception e) {
      this.showAlertMessage("Erro ao salvar arquivo de database.");
    }
  } 
}
