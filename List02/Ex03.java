package List02;

import java.util.*;

public class Ex03 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        long letraA = 0, letraE = 0;

        for (int i=0; i < 3; i++) {
            System.out.printf("Nome %d: ", i+1);
            nomes.add(input.next());

            String nome = nomes.get(i);

            letraA += nome.chars().filter(ch -> ch == 'a' || ch == 'A').count();
            letraE += nome.chars().filter(ch -> ch == 'e' || ch == 'E').count();
        }

        System.out.printf("\nQuantidade de ltras A: %d\n", letraA);
        System.out.printf("Quantidade de ltras E: %d\n", letraE);


        input.close();
    }
}
