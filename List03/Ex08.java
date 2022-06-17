package List03;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Registro[] Filmes = new Registro[3];

		for (int i = 0; i < 3; i++) {
			Filmes[i] = new Registro();

			Filmes[i].lerDados();
			Filmes[i].imprimirDados();
		}
	}

	public static class Registro {
		private String nome;
		private String autor;
		private int ano;
		private double preco;

		public void imprimirDados() {
			System.out.print("\n=-=-=-=-| Saída |=-=-=-=\n");

			System.out.println("Nome: "+this.nome);
			System.out.println("Autor: "+this.autor);
			System.out.println("Ano: "+this.ano);
			System.out.println("Preço: "+this.preco);
		}

		public void lerDados() {
			System.out.print("\n=-=-=-=-| Entrada |=-=-=-=\n");

			Scanner input = new Scanner(System.in);

			System.out.print("Nome: ");
			this.nome = input.nextLine();

			System.out.print("Autor: ");
			this.autor = input.nextLine();

			System.out.print("Ano: ");
			this.ano = input.nextInt();

			System.out.print("Preço: ");
			this.preco = input.nextDouble();

			input.close();
		}
	}
}