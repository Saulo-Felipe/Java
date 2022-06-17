package JogoDaVelha2;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;

public class Tools {
  private Scanner input;
  private File file;


  public void showAlertMessage(String message) {
    JOptionPane.showMessageDialog(null, message);
  }

  public String searchUsername(String username) {
    try {
      this.file = new File("database.txt");
      this.file.createNewFile();
      this.input = new Scanner(this.file);

      while (input.hasNextLine()) {
        String user = input.nextLine();
        
        if (user.equals(username)) {
          return user;
        }
      }

    } catch(Exception e) {
      this.showAlertMessage("Ocorreu um erro ao tentar abrir arquivo.");
    }

    return "Not Found";
  }

}
