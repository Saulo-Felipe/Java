import java.util.Scanner;

public class Ex01 {
    private static int jog;
    private static int[][] casa = new int[3][3];
    private static int linha, coluna, vencedor;
    private static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {
        int i = 0;
        
        for (i = 0; i < 9; i++) {
            printJogo();
            
            if (i % 2 == 0) jogar(2);
            else jogar(1);
            
            check();
            
            if (vencedor == 1 || vencedor == 2) i = 10;
        }
        
        printJogo();
                
        if (vencedor == 1 || vencedor == 2) 
            System.out.println("Jogador " + vencedor + " é o ganhador!");
        else 
            System.out.println("Não houve vencedor! O jogo acabou em empate!");
    }
    
    public static void desenha(int x, int y) {
        if (casa[x][y] == 1)
            System.out.print("X");

        else if (casa[x][y] == 2)
            System.out.print("O");

        else
            System.out.print(" ");
    }
    
    public static void printJogo() {    
        System.out.print("\n  1   2   3\n");
        
        System.out.print("1 ");
        desenha(0, 0);
        
        System.out.print("  | ");
        desenha(0, 1);
        
        System.out.print("  | ");
        desenha(0, 2);
        
        System.out.print("\n -----------\n2 ");
        desenha(1, 0);
        
        System.out.print("  | ");
        desenha(1, 1);
        
        System.out.print("  | ");
        desenha(1, 2);
        
        System.out.print("\n -----------\n3 ");
        desenha(2, 0);
        
        System.out.print("  | ");
        desenha(2, 1);
        
        System.out.print("  | ");
        desenha(2, 2);
    }
    
    public static void jogar(int jogador) {
        int i = 0;
        
        if (jogador == 1) 
            jog = 1;
        else
            jog = 2;
        
        System.out.println("\n\n Vez do Jogador " + jog);

        while (i == 0) {
            linha = 0;
            coluna = 0;

            while (linha < 1 || linha > 3) {
                System.out.print("Escolha a Linha (1,2,3):");
                
                linha = leitor.nextInt();
                
                if (linha < 1 || linha > 3)
                    System.out.println("Linha invalida! Escolha uma linha entre 1 e 3.");

            }

            while (coluna < 1 || coluna > 3) {
                System.out.print("Escolha a Coluna (1,2,3):");
                
                coluna = leitor.nextInt();
                if (coluna < 1 || coluna > 3)
                    System.out.println("Coluna invalida! Escolha uma coluna entre 1 e 3.");

            }
            
            linha = linha - 1;
            coluna = coluna - 1;

            if (casa[linha][coluna] == 0) {                
                casa[linha][coluna] = jog;
                i = 1;
            } else
                System.out.println("Posição ocupada!");

        }
    }
    
    public static void check() {
        int i = 0;
        
        for (i = 0; i < 3; i++) {
            if (casa[i][0] == casa[i][1] && casa[i][0] == casa[i][2]) {
                if (casa[i][0] == 1) vencedor = 1;
                if (casa[i][0] == 2) vencedor= 2;
            }
        }
        
        for (i = 0; i < 3; i++) {
            if (casa[0][i] == casa[1][i] && casa[0][i] == casa[2][i]) {
                if (casa[0][i] == 1) vencedor = 1;
                if (casa[0][i] == 2) vencedor = 2;
            }
        }
        
        if (casa[0][0] == casa[1][1] && casa[0][0] == casa[2][2]) {
            if (casa[0][0] == 1) vencedor = 1;
            if (casa[0][0] == 2) vencedor = 2;
        }
        
        if (casa[0][2] == casa[1][1] && casa[0][2] == casa[2][0]) {
            if (casa[0][2] == 1) vencedor = 1;
            if (casa[0][2] == 2) vencedor = 2;
        }
    }
}