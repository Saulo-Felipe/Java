package List01;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        try {
            int idade;
            Scanner input = new Scanner(System.in);
            
            System.out.print("Digite sua idade: ");
            idade = input.nextInt();
            
            if (idade < 16) {
                System.out.println("Não eleitor.");
            } else if ((idade >= 16 && idade < 18) || idade > 65) {
                System.out.println("Eleitor facultativo.");
            } else {
                System.out.println("Eleitor obrigatório.");
            }
            
            input.close();
        }
        catch(Exception e) {
            System.out.println("\nPor favor, informe apenas números inteiros.");
        }
    }
}