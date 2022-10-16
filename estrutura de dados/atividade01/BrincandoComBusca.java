package atividade01;

class Main {
	public static void main(String[] args) {
		Busca busca = new Busca();

		//int[] array = busca.geraVetorNumericoOrdenado(10);

		int[] array = new int[]{0, 1, 2, 3, 8, 20, 30, 40, 88, 89, 90};

		boolean achou = busca.buscaBinaria_iterativa(array, 1);

		if (achou) {
			System.out.println("O elemento pertence ao array.");
		} else {
			System.out.println("O elemento NÃO pertence ao array.");
		}

	}
}
