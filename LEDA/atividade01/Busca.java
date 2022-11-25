package atividade01;

public class Busca implements Busca_IF {

	public int[] geraVetorNumericoOrdenado(int tamanho) {
		int[] numbers = new int[tamanho];

		for (int c = 1; c <= tamanho; c++) {
			numbers[c-1] = c;
		}

		return numbers;
	}

	public boolean buscaLinear_iterativa(int[] numeros, int num) {
		for (int c = 0; c < numeros.length; c++) {
			if (numeros[c] == num) {
				return true;
			}
		}

		return false;
	}

	public boolean buscaLinear_recursiva(int[] numeros, int num) {

		return buscaLinear_recursiva(numeros, num, 0);
	}

	public boolean buscaBinaria_iterativa(int[] numeros, int num) {
		int start = 0;
		int end = numeros.length-1;

		while (start-1 != end) {
			if (numeros[(end + start)/2] > num)
				end = (end + start)/2-1;
			else if (numeros[(end + start)/2] < num)
				start = (end + start)/2+1;
			else {
				return true;
			}
		}

		return false;
	}

	public boolean buscaBinaria_recursiva(int[] numeros, int num) {
		return buscaBinaria_recursiva(numeros, num, 0, numeros.length-1);
	}

	/*
	 * Métodos complementares
	*/
	public boolean buscaBinaria_recursiva(int[] numeros, int num, int start, int end) {
		if (start-1 != end) {
			if (numeros[(end + start)/2] > num)
				end = (end + start)/2-1;
			else if (numeros[(end + start)/2] < num)
				start = (end + start)/2+1;
			else
				return true;

			return buscaBinaria_recursiva(numeros, num, start, end);
		}

		return false;
	}

	public boolean buscaLinear_recursiva(int[] numeros, int num, int index) {
		if (numeros[index] == num) {
			return true;
		} else if (index == numeros.length-1) {
			return false;
		}

		return buscaLinear_recursiva(numeros, num, index+1);
	}
}
