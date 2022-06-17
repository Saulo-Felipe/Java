package List03;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a string S1: ");
		String S1 = input.next();

		System.out.print(
			"\n=-=-=-=-=| Opções |=-=-=-=-=\n"+
			"(a) Imprimir o tamanho da string S1;\n"+
			"(b) Comparar a string S1 com uma nova string S2 fornecida pelo usuário e imprimir o resultado da comparação;\n"+
			"(c) Concatenar a string S1 com uma nova string S2 e imprimir na tela o resultado da concatenação;\n"+
			"(d) Imprimir a string S1 de forma inversa;\n"
		);

		System.out.print("Escolha uma opção: ");
		String opcao = input.next();

		if (opcao.equals("a")) {
			System.out.printf("\nTamanho da string: %d\n", S1.length());
		} 
		else if (opcao.equals("b")) {
			System.out.print("Digite a string S2: ");
			String S2 = input.next();

			if (S2.equals(S1)) 
				System.out.println("Strings iguais");
			else 
				System.out.println("As duas strings não são iguais");
		} 
		else if (opcao.equals("c")) {
			System.out.print("Digite a string S2: ");
			String S2 = input.next();

			System.out.println(S1+S2);

		} 
		else if (opcao.equals("d")) {
			System.out.println("S1 inversa: "+new StringBuilder(S1).reverse().toString());
		}

		input.close();
	}
}