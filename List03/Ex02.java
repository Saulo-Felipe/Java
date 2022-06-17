package List03;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float[] notas = new float[3];

		for (int i=0; i < 3; i++) {
			System.out.printf("Nota %d: ", i+1);
			notas[i] = input.nextFloat();
		}

		System.out.printf("Letra: ");
		String letra = input.next();

		float resultado = calcularMedia(notas[0], notas[1], notas[2], letra);

		if (resultado == -1)
			System.out.println("Letra inválida");
		else 
			System.out.println("Sua média: " + resultado);
		
		input.close();
	}

	public static float calcularMedia(float nota01, float nota02, float nota03, String letra) {
		if (letra.equals("A"))
			return (nota01 + nota02 + nota03) / 3;
		else if (letra.equals("P"))
			return ((nota01*5) + (nota02*3) + (nota03*2)) / 10;
		else
			return -1;
	}
}