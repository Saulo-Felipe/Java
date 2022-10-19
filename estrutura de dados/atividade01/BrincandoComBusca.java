package atividade01;

class Main {
	public static void main(String[] args) {
		Busca busca = new Busca();

		//int[] array = busca.geraVetorNumericoOrdenado(10);

		int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		boolean bbi = busca.buscaBinaria_iterativa(array, 3);

		if (bbi) {
			System.out.println("[BBI] O elemento pertence ao array.");
		} else {
			System.out.println("[BBI] O elemento NÃO pertence ao array.");
		}

		//boolean bbr = busca.buscaBinaria_recursiva(array, 89, 1); 

	}
}
