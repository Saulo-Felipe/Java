package atividade02;

/*
 * Interface para implementação da classe "Ordenacao".
 * O método booleano deve retornar 'false' se 'numeros' não estiver ordenado (crescente). 
 */
public interface Ordenacao_IF {
	
	boolean checaVetorOrdenado(int[] numeros);
	
	long selectionSort(int[] numeros);
	
	long insertionSort(int[] numeros);
	
	long mergeSort(int[] numeros);
	
	long quickSort(int[] numeros);
	
	long quickSort_shuffle(int[] numeros);
	
	long countingSort(int[] numeros);

}