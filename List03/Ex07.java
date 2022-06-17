package List03;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int index = 0;

		System.out.print("Primeiro número: ");
		int var1 = input.nextInt();

		System.out.print("Segundo número: ");
		int var2 = input.nextInt();

		if (var1 > var2)
			divisorComum(var1, var2, index);
		else
			divisorComum(var2, var1, index);
		
		input.close();
	}

	public static void divisorComum(int var1, int var2, int index) {
		if (var1 - index > 0) {
			if ((var1 % (var1 - index) == 0) && (var2 % (var1-index) == 0))
				System.out.printf("\nMáximo divisor comum entre %d e %d = %d\n", var1, var2, var1-index);
			else
				divisorComum(var1, var2, index+1);
		}
	}
}