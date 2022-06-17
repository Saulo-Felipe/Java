package List03;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Número: ");
		int num = verifyInt(input.nextInt());

		if (num == 1) System.out.println("Número par.");
		else System.out.println("Número Ímpar.");

		input.close();
	}

	public static int verifyInt(int number) {
		if (number % 2 == 0)
			return 1;
		else
			return 0;
	}
}