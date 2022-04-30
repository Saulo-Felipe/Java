package List01;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    try {

      Scanner input = new Scanner(System.in);

      System.out.print("Nome do aluno: ");
      String alunoNome = input.nextLine();

      System.out.print("Disciplina: ");
      String disciplina = input.nextLine();
      
      double media = 0;
      for (int i=0; i < 4; i++) {
        System.out.printf("Nota %d: ", i+1);
        double nota = input.nextDouble();
        media += (nota/4);
      }
      
      System.out.printf("\n=-=-=-=-=-=-=-=-=-=-="
        + "\nALUNO: %s"
        + "\nDISCIPLINA: %s"
        + "\nMÉDIA: %.2f"
        + "\n=-=-=-=-=-=-=-=-=-=-=\n",
        alunoNome,
        disciplina,
        media
      );

      input.close();
    }
    catch(Exception e) {
      System.out.println("\nPor favor, informe apenas números válidos. (use ',' para número quebrados)");
    }
  }
}