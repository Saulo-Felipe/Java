package atividade02;

import java.util.Random;

public class BrincandoComOrdenacao {

	public static void main(String[] args) {
		
		Ordenacao ordenacao = new Ordenacao();
		int tamanho1 = 10000;
		int tamanho2 = 10000;
		int tamanho3 = 15000;

		/*
		 *-=-=-=-=-=-=-=-=-| Implementação dos algoritmos |-=-=-=-=-=-=-=-=
		*/
		// * Lembrar de executar o teste calcular o tempo

		/*
		 *-=-=-=-=-=-=-=-=-| Criação dos arrays SelectionSort |-=-=-=-=-=-=-=-=
		*/
		int[] array1 = new int[tamanho1]; // Crescente
		for (int i = 0; i < tamanho1; i++) {
			array1[i] = i;
		}

		int[] array2 = new int[tamanho1]; // Decrescente
		for (int i = 0; i < tamanho1; i++) {
			array2[i] = tamanho1-i;
		}

		int[] array3 = new int[tamanho1]; // Aleatório
		Random random = new Random();
		for (int i = 0; i < tamanho1; i++) {
			array3[i] = random.nextInt(tamanho1);
		}

		// -> SelectionSort [concluído]


		//ARRAY1
		long antes1, depois1;
        long totalAntes1 = 0, totalDepois1 = 0;
        // ordenacao.exibir(array1); //TIRAR COMENTÁRIO PARA VER ARRAY ANTES

        	for (int i = 0; i < 50; i++) {
        		antes1 = System.nanoTime();
        		ordenacao.selectionSort(array1);
        		depois1 = System.nanoTime();
        		totalAntes1+= antes1;
        		totalDepois1+= depois1;
        	}
		long media1 = (totalDepois1 - totalAntes1)/50;

        // ordenacao.exibir(array1); //TIRAR COMENTÁRIO PARA VER ARRAY DEPOIS
        System.out.println(media1); //Media do NanoTime
		
		//Array2
		long antes2, depois2;
        long totalAntes2 = 0, totalDepois2 = 0;
        // ordenacao.exibir(array2); //TIRAR COMENTÁRIO PARA VER ARRAY ANTES

        	for (int i = 0; i < 50; i++) {
        		antes2 = System.nanoTime();
        		ordenacao.selectionSort(array2);
        		depois2 = System.nanoTime();
        		totalAntes2+= antes2;
        		totalDepois2+= depois2;
        	}
		long media2 = (totalDepois2 - totalAntes2)/50;
		
        // ordenacao.exibir(array2); //TIRAR COMENTÁRIO PARA VER ARRAY DEPOIS
        System.out.println(media2); //Media do NanoTime

		//Array3
		long antes3, depois3;
        long totalAntes3 = 0, totalDepois3 = 0;
        // ordenacao.exibir(array2); //TIRAR COMENTÁRIO PARA VER ARRAY ANTES

        	for (int i = 0; i < 50; i++) {
        		antes3 = System.nanoTime();
        		ordenacao.selectionSort(array2);
        		depois3 = System.nanoTime();
        		totalAntes3+= antes3;
        		totalDepois3+= depois3;
        	}
		long media3 = (totalDepois3 - totalAntes3)/50;
		
        // ordenacao.exibir(array3); //TIRAR COMENTÁRIO PARA VER ARRAY DEPOIS
        System.out.println(media3); //Media do NanoTime

	

		/*
		 *-=-=-=-=-=-=-=-=-| Criação dos arrays InsertionSort |-=-=-=-=-=-=-=-=
		*/
		int[] array4 = new int[tamanho1]; // Crescente
		for (int i = 0; i < tamanho1; i++) {
			array4[i] = i;
		}

		int[] array5 = new int[tamanho1]; // Decrescente
		for (int i = 0; i < tamanho1; i++) {
			array5[i] = tamanho1-i;
		}

		int[] array6 = new int[tamanho1]; // Aleatório
		for (int i = 0; i < tamanho1; i++) {
			array6[i] = random.nextInt(tamanho1);
		}
		
		// -> InsertionSort [concluído]

		//ARRAY4
		long antes4, depois4;
        long totalAntes4 = 0, totalDepois4 = 0;
        // ordenacao.exibir(array4); //TIRAR COMENTÁRIO PARA VER ARRAY ANTES

        	for (int i = 0; i < 50; i++) {
        		antes4 = System.nanoTime();
        		ordenacao.insertionSort(array4);
        		depois4 = System.nanoTime();
        		totalAntes4+= antes4;
        		totalDepois4+= depois4;
        	}
		long media4 = (totalDepois4 - totalAntes4)/50;

        // ordenacao.exibir(array4); //TIRAR COMENTÁRIO PARA VER ARRAY DEPOIS
        System.out.println(media4); //Media do NanoTime

		//ARRAY5
		long antes5, depois5;
        long totalAntes5 = 0, totalDepois5 = 0;
        // ordenacao.exibir(array5); //TIRAR COMENTÁRIO PARA VER ARRAY ANTES

        	for (int i = 0; i < 50; i++) {
        		antes5 = System.nanoTime();
        		ordenacao.insertionSort(array5);
        		depois5 = System.nanoTime();
        		totalAntes5+= antes5;
        		totalDepois5+= depois5;
        	}
		long media5 = (totalDepois5 - totalAntes5)/50;

        // ordenacao.exibir(array5); //TIRAR COMENTÁRIO PARA VER ARRAY DEPOIS
        System.out.println(media5); //Media do NanoTime

		//ARRAY6
		long antes6, depois6;
        long totalAntes6 = 0, totalDepois6 = 0;
        // ordenacao.exibir(array6); //TIRAR COMENTÁRIO PARA VER ARRAY ANTES

        	for (int i = 0; i < 50; i++) {
        		antes6 = System.nanoTime();
        		ordenacao.insertionSort(array6);
        		depois6 = System.nanoTime();
        		totalAntes6+= antes6;
        		totalDepois6+= depois6;
        	}
		long media6 = (totalDepois6 - totalAntes6)/50;

        // ordenacao.exibir(array6); //TIRAR COMENTÁRIO PARA VER ARRAY DEPOIS
        System.out.println(media6); //Media do NanoTime
		
		
		/*
		 *-=-=-=-=-=-=-=-=-| Criação dos arrays MergeSort |-=-=-=-=-=-=-=-=
		*/
		int[] array7 = new int[tamanho1]; // Crescente
		for (int i = 0; i < tamanho1; i++) {
			array7[i] = i;
		}

		int[] array8 = new int[tamanho1]; // Decrescente
		for (int i = 0; i < tamanho1; i++) {
			array8[i] = tamanho1-i;
		}

		int[] array9 = new int[tamanho1]; // Aleatório
		for (int i = 0; i < tamanho1; i++) {
			array9[i] = random.nextInt(tamanho1);
		}
		// -> MergeSort
		
		//ARRAY7
		long antes7, depois7;
        long totalAntes7 = 0, totalDepois7 = 0;
        // ordenacao.exibir(array7); //TIRAR COMENTÁRIO PARA VER ARRAY ANTES

        	for (int i = 0; i < 50; i++) {
        		antes7 = System.nanoTime();
        		ordenacao.mergeSort(array4);
        		depois7 = System.nanoTime();
        		totalAntes7+= antes7;
        		totalDepois7+= depois7;
        	}
		long media7 = (totalDepois7 - totalAntes7)/50;

        // ordenacao.exibir(array7); //TIRAR COMENTÁRIO PARA VER ARRAY DEPOIS
        System.out.println(media7); //Media do NanoTime

		//ARRAY8
		long antes8, depois8;
        long totalAntes8 = 0, totalDepois8 = 0;
        // ordenacao.exibir(array8); //TIRAR COMENTÁRIO PARA VER ARRAY ANTES

        	for (int i = 0; i < 50; i++) {
        		antes8 = System.nanoTime();
        		ordenacao.mergeSort(array8);
        		depois8 = System.nanoTime();
        		totalAntes8+= antes8;
        		totalDepois8+= depois8;
        	}
		long media8 = (totalDepois8 - totalAntes8)/50;

        // ordenacao.exibir(array8); //TIRAR COMENTÁRIO PARA VER ARRAY DEPOIS
        System.out.println(media8); //Media do NanoTime

		//ARRAY9
		long antes9, depois9;
        long totalAntes9 = 0, totalDepois9 = 0;
        // ordenacao.exibir(array9); //TIRAR COMENTÁRIO PARA VER ARRAY ANTES

        	for (int i = 0; i < 50; i++) {
        		antes9 = System.nanoTime();
        		ordenacao.mergeSort(array6);
        		depois9 = System.nanoTime();
        		totalAntes9+= antes9;
        		totalDepois9+= depois9;
        	}
		long media9 = (totalDepois9 - totalAntes9)/50;

        // ordenacao.exibir(array9); //TIRAR COMENTÁRIO PARA VER ARRAY DEPOIS
        System.out.println(media9); //Media do NanoTime


		// -> QuickSort (conforme slide da disciplina);
		//.....código aqui


		// -> QuickSort_Shuffle (usar shuffle antes do algoritmo do slide);
		//.....código aqui


		// -> CountingSort
		//.....código aqui
	}

}
