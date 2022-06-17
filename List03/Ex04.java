package List03;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("String 1: ");
		String string1 = input.next();

		System.out.print("String 2: ");
		String string2 = input.next();

		if (string1.equals(string2))
			System.out.println("Strings iguais!");
		else 
			System.out.println(string1 + string2);
		
		input.close();
	}
}