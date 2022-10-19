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
		int start = 0;
		int end = numeros.length-1;
		int pos = (end + start)/2;

		while (pos != start || pos != end) {
			pos = (end + start)/2;
			System.out.println("start: "+end+"\n");
			System.out.println("end: "+end+"\n");
			System.out.println("end: "+end+"\n");


			if (numeros[pos] > num) {
				end = pos;

			} else if (numeros[pos] < num) {
				start = pos;				
				
			} else {
				return true;
			}
		}

		return false;
	}

	public boolean buscaBinaria_recursiva(int[] numeros, int num) {
		return true;
	}

}
