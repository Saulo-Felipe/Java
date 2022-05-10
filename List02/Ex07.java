package List02;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int[][] matrizA = new int[5][5];
        int[][] matrizB = new int[5][5];
        Scanner input = new Scanner(System.in);

        for (int a=0; a < 2; a++) { // ENtrada
            System.out.printf("\nMATRIZ %s\n", a == 0? "A" : "B");
            for (int c=0; c < 5; c++) {
                System.out.printf("====| Linha %d |====\n", c+1);
                for (int i=0; i < 5; i++) {
                    System.out.printf("Coluna %d: ", i+1);
                    if (a == 0) matrizA[c][i] = input.nextInt();
                    else matrizB[c][i] = input.nextInt();
                }
            }
        }

        for (int a=0; a < 2; a++) { // Mostra as matrizes
            System.out.printf("\nMATRIZ %s\n", a == 0 ? "A" : "B");
            for (int c=0; c < 5; c++) {
                for (int i=0; i < 5; i++) {
                    System.out.printf("%d ", a == 0 ? matrizA[c][i] : matrizB[c][i]);
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }

        for (int a=0; a < 2; a++) { // Saída
            System.out.printf("A %s B: \n", a == 0?"+":"-");
            for (int c=0; c < 5; c++) {
                for (int i=0; i < 5; i++) {
                    System.out.printf("%d ", a == 0 ? matrizA[c][i] + matrizB[c][i] : matrizA[c][i] - matrizB[c][i]);
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }

        input.close();
    }
}
