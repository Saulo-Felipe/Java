package atividade02;

public class Ordenacao implements Ordenacao_IF{

	@Override
	public boolean checaVetorOrdenado(int[] numeros) {
		for (int i = 1; i < numeros.length; i++)
			if (numeros[i - 1] > numeros[i])
				return false;
	    return true;
	}
	
	@Override
	public long selectionSort(int[] numeros) {
		int tamanho = numeros.length;
		for (int i = 0; i < tamanho; ++i) {
	        int min = i;
	        for (int j = i+1; j < tamanho; ++j) {
	            if (numeros[j] < numeros[min]) {
	                min = j;
	            }
	        }
	        swap(numeros, i, min);
	        
	    }
		return 0;
	}
	private void swap(int[] numeros, int i, int min) {
		int aux = numeros[i];
        numeros[i] = numeros[min];
        numeros[min] = aux;
	}
	
	public void exibir(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("[" + numeros[i] + "]");
		}
		System.out.println("\n");
		
	}

	@Override
	public long insertionSort(int[] numeros) {
        for (int c = 1; c < numeros.length; c++) {
            for (int i = 0; i < c; i++) {
                if (numeros[c] < numeros[i]) {
                    int[] arrCopy = numeros.clone();
                    numeros[i] = arrCopy[c];

                    for (int e = i; e < c; e++) {
                        numeros[e+1] = arrCopy[e];
                    }
                    break;
                }
            }
        }

        return 0;
    }

	@Override
	public long mergeSort(int[] numeros) {		
		
		mergeSort2(numeros, 0, numeros.length);
		
		return 0;
	}
	
	public static void mergeSort2(int[] numeros, int left, int right){
		if (right - left < 2)
			return;
		
		mergeSort2(numeros, left, left + (right - left) / 2);
		mergeSort2(numeros, left + (right - left) / 2, right);
		merge(numeros, left, left + (right - left) / 2, right);
	}
	
	public static void merge(int[] numeros, int left, int m, int right){
		int tamanho = numeros.length;
		int[] arrayTemporario = new int[tamanho];
		int ai = left, bi = m, ti = left;

		while (ai < m || bi < right){
			if (ai == m)
				arrayTemporario[ti++] = numeros[bi++];
			else if (bi == right)
				arrayTemporario[ti++] = numeros[ai++];
			else if (numeros[ai] < numeros[bi])
				arrayTemporario[ti++] = numeros[ai++];
			else
				arrayTemporario[ti++] = numeros[bi++]; 
		}

		for (ti = left; ti < right; ti++)
			numeros[ti] = arrayTemporario[ti];
	}
	
	@Override
	public long quickSort(int[] numeros) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long quickSort_shuffle(int[] numeros) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long countingSort(int[] numeros) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
