package others.JogoDaVelha;
import java.util.Scanner;
import java.util.Random;
import java.lang.Thread;

public class Main {
  public static void main(String[] args) {
    int playerPoints = 0;
    int pcPoints = 0;

    while (true) {
      System.out.print("\033[H\033[2J");
      System.out.flush();

      System.out.println("==========| Jogo da velha |==========");
      Scanner input = new Scanner(System.in);
      Random random = new Random();

      System.out.println("Seus pontos: "+playerPoints);
      System.out.println("pontos do robô: "+pcPoints);

      System.out.print(
        "\n[1] Pedra\n"+
        "[2] Papel\n" +
        "[3] Tesoura\n" +
        "[4] Sair\n\n"
      );

      System.out.print("Sua opção -> ");

      String option = input.nextLine();
      int bootOption = random.nextInt(3);
      
      System.out.println("\nJO");
      sleep();
      System.out.println("KEN");
      sleep();
      System.out.println("PÔ!");
      sleep();

      String bootValue = bootOption == 0 ? "Pedra": bootOption == 1 ? "Papel" : "Tesoura";
      System.out.println("\nO robô jogou " + bootValue);

      
      if (option.equals("1") || option.toLowerCase().equals("pedra")) {
        switch (bootOption) {
          case 0: // Pedra
            draw();
            break;

          case 1: // Papel
            pcWin();
            pcPoints++;
            break;

          case 2: // Tesoura
            playerWin();
            playerPoints++;
            break;
        }
      } else if (option.equals("2") || option.toLowerCase().equals("papel")) {

        switch (bootOption) {
          case 0: // Pedra
            playerWin();
            playerPoints++;
            break;

          case 1: // Papel
            draw();
            break;

          case 2: // Tesoura
            pcWin();
            pcPoints++;
            break;
        }

      } else if (option.equals("3") || option.toLowerCase().equals("tesoura")) {
        
        switch (bootOption) {
          case 0: // Pedra
            pcWin();
            pcPoints++;
            break;

          case 1: // Papel
            playerWin();
            playerPoints++;
            break;

          case 2: // Tesoura
            draw();
            break;
        }
      } else if (option.equals("4")) {
        System.out.println("\nFim de Jogo");
        input.close();
        return;
      }

      System.out.println("\nAperter ENTER para continuar");
      try { System.in.read(); }
      catch(Exception e ) { }
    }
  }

  public static void playerWin() {
    System.out.println("Você venceu!");
  }

  public static void pcWin() {
    System.out.println("O robô venceu! :(");
  }

  public static void draw() {
    System.out.println("Empate!");
  }

  public static void sleep() {
    try { Thread.currentThread().sleep(1000); }
    catch(Exception e) {  }
  }
}
