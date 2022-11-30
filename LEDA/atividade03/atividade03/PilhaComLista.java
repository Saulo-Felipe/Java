package atividade03;

public class PilhaComLista implements Pilha_IF {
	
	protected ListaEncadeada pilha;
	
	public PilhaComLista() {
		this.pilha = new ListaEncadeada();
	}

	@Override
	public void push(int element) throws Exception {
		if(isFull())
			System.out.println("Pilha cheia");
		else {
			pilha.insert(element);
		}
	}

	@Override
	public int pop() throws Exception {
		int topo = top();
		if(isEmpty())
			System.out.println("Pilha vazia");
		else {
			pilha.remove(top());
		}
		return topo;
	}

	@Override
	public int top() throws Exception {
		return pilha.toArray()[0];
	}

	@Override
	public boolean isEmpty() {
		return pilha.isEmpty();
	}

	@Override
	public boolean isFull() {			
		return pilha.size() == 10;
	}
	
  // outros métodos
  public int getByIndex(int index) {
    if (index == -1 || index > 9) {
      return pilha.toArray()[pilha.size()-1];
    }

    return pilha.toArray()[index];
  }

  public int size() {
    return pilha.size();
  }

}