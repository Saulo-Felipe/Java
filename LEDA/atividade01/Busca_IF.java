package atividade01;

/*
 * Interface para implementação da classe "Busca".
 * Os métodos booleanos devem retornar 'false' se 'num' não estiver no vetor 'numeros'. 
 */

public interface Busca_IF {
	
	int[] geraVetorNumericoOrdenado(int tamanho);
	
	boolean buscaLinear_iterativa(int[] numeros, int num);

	boolean buscaLinear_recursiva(int[] numeros, int num);

	boolean buscaBinaria_iterativa(int[] numeros, int num);

	boolean buscaBinaria_recursiva(int[] numeros, int num);
}