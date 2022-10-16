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
		boolean myBoolean = true;
		

		return myBoolean;
	}

	public boolean buscaLinear_recursiva(int[] numeros, int num) {
		return true;
	}


	public boolean buscaBinaria_iterativa(int[] numeros, int num) {
		int tamanhoAtualizado = numeros.length;

		for (int c = 0; c < numeros.length; c++) {
			int pos = tamanhoAtualizado/2;

			if (numeros[pos] == num) {
				return true;

			} else {
				for (int i = 0; i < tamanhoAtualizado/2; i++) {
					numeros[i] = numeros[pos+i+1];
				}

			}
			tamanhoAtualizado = pos;

			if (pos == 0) return false;
		}

		return false;
	}

	public boolean buscaBinaria_recursiva(int[] numeros, int num) {
		return true;
	}

}
