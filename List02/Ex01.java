package List02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int numero = 0;
            
            System.out.print("Digite um número: ");
            numero = input.nextInt();
            input.close();
            
            for (int c=1; c < 11; c++) {
                System.out.printf("\n%d x %d = %d", numero, c, numero*c);
            }
            
            System.out.println("\n");
            
        }
        catch(Exception e) {
            System.out.println("Digite apenas números inteiros!");
        }
        
    }
}
