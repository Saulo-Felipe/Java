package List02;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> salarios = new ArrayList<Double>();
        ArrayList<Integer> filhos = new ArrayList<Integer>();

        while (true) {
            System.out.printf("\nSalário %d: R$", salarios.size()+1);
            double salario = input.nextDouble();

            if (salario == -1)
                break;
            
            salarios.add(salario);

            System.out.printf("Nº de filhos: ");
            filhos.add(input.nextInt());
        }

        double salarioMedia = 0;
        for (Double s : salarios)
            salarioMedia += s;
        
        int filhosMedia = 0;
        for (int f : filhos)
            filhosMedia += f;
        
        System.out.printf("\nMédia de salário: %.2f", salarioMedia/salarios.size());
        System.out.printf("\nMédia de filhos: %d\n", (int) filhosMedia/filhos.size());

        input.close();
    }
}
