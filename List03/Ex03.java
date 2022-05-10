package List03;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float X, Y, Z;

		System.out.print("X: ");
		X = input.nextFloat();

		System.out.print("Y: ");
		Y = input.nextFloat();

		System.out.print("Z: ");
		Z = input.nextFloat();

		String tipoTriangulo = verificaTriangulo(X, Y, Z);

		System.out.println("Tipo do triângulo: " + tipoTriangulo);
	}

	public static String verificaTriangulo(float X, float Y, float Z) {
		if ((X < Y+Z) && (Y < X+Z) && (Z < X+Y)) {
			
			if (X == Z && Z == Y) 
				return "Equilátero";
			else if ((X == Z) || (X == Y) || (Y == Z))
				return "Isósceles";
			else 
				return "Escaleno";

		} else 
			return "Esses comprimentos não formam um triângulo!";
	}
}
