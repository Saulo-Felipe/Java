package List02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] alunos = new double[5][3];
        
        for (int c=0; c < 5; c++) {
            System.out.printf("\n===| %dº Aluno |===\n", c+1);
            for (int i=0; i < 3; i++) {
                System.out.printf("Nota %d: ", i+1);
                alunos[c][i] = input.nextDouble();
            }
        }

        for (int c=0; c < 5; c++) {
            double media = (alunos[c][0] + alunos[c][1] + alunos[c][2]) / 3;

            System.out.printf("\nMédia do %dº Aluno: %.2f (%s)",
                c+1, 
                media,
                media >= 7 ? "Aprovado" : "Reprovado"
            );
        }

        input.close();
    }
}
