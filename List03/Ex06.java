package List06;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Valor de n: ");
		int num = input.nextInt();
		int index = 0;
		int soma = 0;

		soma(num, index, soma);
	}

	public static void soma(int num, int index, int soma) {
		index += 1;
		soma += index;

		System.out.printf("\nSomando +%d", index);

		if (index < num) {
			soma(num, index, soma);
		} else {
			System.out.printf("\nA soma dos números entre 1 e %d = %d\n", num, soma);
		}
	}
}