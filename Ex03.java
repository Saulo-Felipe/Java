package List01;
import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    try {

      double deposito = 0, taxaJuros = 0;
      Scanner input = new Scanner(System.in);

      System.out.print("Valor do depósito: ");
      deposito = input.nextDouble();

      System.out.print("Taxa de juros: ");
      taxaJuros = input.nextDouble();
      
      double rendimento = (taxaJuros/100) * deposito;

      System.out.printf("\nValor do rendimento: %.2f", rendimento);
      System.out.printf("\nValor total: %.2f\n", deposito+rendimento);
      input.close();
    }
    catch(Exception e) {
      System.out.println("\nPor favor, informe apenas números válidos. (use ',' para número quebrados)");
    }
  }
}