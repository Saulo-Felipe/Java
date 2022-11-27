package atividade03;

import java.util.Iterator;

public class ListaEncadeada implements ListaEncadeada_IF {
	protected int[] auxArr = new int[0];

	@Override
	public boolean isEmpty() {
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return auxArr.length;
	}

	@Override
	public int search(int element) throws Exception {
		for (int i = 0; i < this.size(); i++) {
			if (this.auxArr[i] == element) {
				return i; // retorna a posição do elemento
			}
		}

		return -1; // Se não achar retorna -1
	}

	@Override
	public void insert(int element) {
		int[] updateArr = new int[this.size()+1];

		for (int i = 0; i < this.size(); i++) {
			updateArr[i] = this.auxArr[i];
		}
		updateArr[this.size()] = element; // Adiciona o elemento na ultima posição

		this.auxArr = updateArr;
	}

	@Override
	public void remove(int element) {

			
		// TODO Auto-generated method stub		
	}

	@Override
	public int[] toArray() {
		return null;
	}

}
