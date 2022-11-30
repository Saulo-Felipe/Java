package atividade03;

import java.util.Iterator;

/*
 * vazio: data = -1
*/

public class ListaEncadeada implements ListaEncadeada_IF {
	
	protected int data = -1;
	protected ListaEncadeada prox;

	@Override
	public boolean isEmpty() {
		if (data == -1)
			return true;
		return false;
	}

	@Override
	public int size() {
		if (isEmpty())
			return 0;
		else
			return 1+prox.size();
	}

	@Override
	public int search(int element) throws Exception {
		if (isEmpty()) {
			return 0;
		} else {
			if(data == element)
				return data;
			else
				return prox.search(element);
		}
	}

	@Override
	public void insert(int element) {
		if(isEmpty()) {
			data = element;
			prox = new ListaEncadeada();
		}else
			prox.insert(element);
	}

	@Override
	public void remove(int element) {
		if(isEmpty())
			System.out.println("Lista vazia");
		else {
			if(data == element) {
				data = prox.data;
				prox = prox.prox;
			}else
				prox.remove(element);
		}		
	}

	@Override
	public int[] toArray() {		
		int[] result = new int[10];
		toArray2(result, this);
		return result;
	}
	
	private void toArray2(int[] array, ListaEncadeada node){
		if(!(node.isEmpty())) {
			array[node.size()-1] = node.data;
			toArray2(array, node.prox);
		}
	}
	
}
