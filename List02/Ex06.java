package List02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int c=0; c < 3; c++) {
            System.out.printf("====| Linha %d |====\n", c+1);
            for (int i=0; i < 3; i++) {
                System.out.printf("Coluna %d: ", i+1);
                matriz[c][i] = input.nextInt();
            }
        }

        System.out.println("\nOriginal: ");

        for (int c=0; c < 3; c++) {
            for (int i=0; i < 3; i++) {
                System.out.printf("%d ", matriz[c][i]);
            }
            System.out.print("\n");
        }

        System.out.println("\nTransposta: ");

        for (int c=0; c < 3; c++) {
            for (int i=0; i < 3; i++) {
                System.out.printf("%d ", matriz[i][c]);
            }
            System.out.print("\n");
        }

        input.close();
    }
}
