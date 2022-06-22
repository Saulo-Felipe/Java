package JogoDaVelha_v3.OptionPane;

import javax.swing.JOptionPane;

public class HomeOption {
  public static void main() {
    while (true) {
      try {    
        String option = JOptionPane.showInputDialog(
          "[1] Iniciar jogo\n"+
          "[2] Cadastrar usuário\n"+
          "[3] Deletar usuário"
        );

        if (option == null) {
          continue;
        } else {
          switch (Integer.parseInt(option)) {
            case 1:
              // Start game
              break;

            case 2:
              // Create user
              break;
            
            case 3:
              // Delete user
              break;
          
            default:
              break;
          }
        }

        System.out.println(teste);
        break;
      } catch(Exception e) {
        JOptionPane.showMessageDialog(null, "Por favor, insira apenas números válidos");
      }
    }
  }
}
