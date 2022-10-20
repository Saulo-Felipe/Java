package atividade01;

class Main {
	public static void main(String[] args) {
		Busca busca = new Busca();
		int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, };
		int procurarNumero = 200;
		
		long antes = System.nanoTime();
		busca.buscaLinear_iterativa(array, procurarNumero);
		long depois = System.nanoTime();
		System.out.printf("[BLI]: %f\n", (depois-antes)/1000000000.0);

		antes = System.nanoTime();
		busca.buscaLinear_recursiva(array, procurarNumero);
		depois = System.nanoTime();
		System.out.printf("[BLR]: %f\n", (depois-antes)/1000000000.0);

		antes = System.nanoTime();
		busca.buscaBinaria_iterativa(array, procurarNumero);
		depois = System.nanoTime();
		System.out.printf("[BBI]: %f\n", (depois-antes)/1000000000.0);

		antes = System.nanoTime();
		busca.buscaBinaria_recursiva(array, procurarNumero);
		depois = System.nanoTime();
		System.out.printf("[BBR]: %f\n", (depois-antes)/1000000000.0);
	}
}
