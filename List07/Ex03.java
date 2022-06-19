import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Deseja que ocorra um erro? ");
      System.out.println("[1] Sim\n[2] Não");
      
      if (input.nextInt() == 1) {
        throw new Exception();
      }

    } catch(Exception e) {
      System.out.println("Erro processado.");
    } finally {
      System.out.println("Finally executado :D");
      input.close();
    }
  }
}
