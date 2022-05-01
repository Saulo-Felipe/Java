package List02;

import java.util.*;

public class Ex04 {
    public static void main(String[] args) {
        int[] crescente = new int[10];
        int[] decrescente = new int[10];

        Scanner input = new Scanner(System.in);

        for (int c=0; c < 10; c++) {
            System.out.printf("Número %d: ", c+1);
            crescente[c] = input.nextInt();
        }

        Arrays.sort(crescente);

        for (int i=0; i < 10; i++)
            decrescente[i] = crescente[9-i];

        for (int c=0; c < 20; c++) {
            if (c < 10) {
                if (c == 0)
                    System.out.print("\nOrdem crescente: ");
                System.out.printf("%d | ", crescente[c]);

            } else {
                if (c-10 == 0)
                    System.out.print("\nOrdem decrescente: ");
                System.out.printf("%d | ", decrescente[c-10]);
            }
        }

        input.close();
    }
}
