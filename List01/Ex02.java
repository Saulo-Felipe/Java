package List01;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        try {
            double[] madeiras = new double[3];
            Scanner input = new Scanner(System.in);
            
            for (int c=0; c < 3; c++) {
                System.out.printf("Comprimeiro da madeira %d: ", c+1);
                madeiras[c] = input.nextDouble();
            }
            
            if ((madeiras[0] > madeiras[1] + madeiras[2]) || (madeiras[2] > madeiras[0] + madeiras[1]) || (madeiras[1] > madeiras[2] + madeiras[0])) {
                System.out.println("Esses pedaços de madeira NÃO formam um triângulo!");
            } else {
                System.out.println("Esses pedaços de madeira formam um triângulo!");
            }
            
            input.close();
        }
        catch(Exception e) {
            System.out.println("\nPor favor, informe apenas números válidos. (use ',' para número quebrados)");
        }
    }
}
