package List01;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int pratoEscolha, bebidaEscolha, totalCalorias = 0;
            
            System.out.print(
            "\n=-=-=-=-=| Prato |=-=-=-=-=\n"
            + "[1] Italiano: 750cal\n"
            + "[2] Japonês: 342cal\n"
            + "[3] Salvadoreno: 545cal\n\n"
            );
            
            System.out.print("-> Qual seu prato? ");
            pratoEscolha = input.nextInt();
            
            switch (pratoEscolha) {
                case 1:
                totalCalorias += 750; 
                break;
                
                case 2:
                totalCalorias += 342; 
                break;
                
                case 3:
                totalCalorias += 545; 
                break;
                default: 
                System.out.print("\nEscolha inválida\n");
                input.close();
                return;
            }
            
            System.out.print(
            "\n=-=-=-=-=| Bebida |=-=-=-=-=\n"
            + "[1] Chá: 30cal\n"
            + "[2] Suco de laranja: 80cal\n"
            + "[3] Refrigerante: 90cal\n\n"
            );
            
            System.out.print("-> Qual sua bebida? ");
            bebidaEscolha = input.nextInt();
            
            switch (bebidaEscolha) {
                case 1:
                    totalCalorias += 30; 
                    break;
                
                case 2:
                totalCalorias += 80; 
                break;
                
                case 3:
                totalCalorias += 90; 
                break;
                
                default:
                System.out.print("\nEscolha inválida\n");
                input.close();
                return;
            }
            
            System.out.printf("Total de calorias: %d cal\n", totalCalorias);
            input.close();
        }
        catch(Exception e) {
            System.out.print("\nInforme apenas números inteiros!\n");
        }
        
    }
}