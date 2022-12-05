package atividade03;

public class FilaComPilhas implements Fila_IF {
	
	protected PilhaComLista p1;
	protected PilhaComLista p2;
	
	public FilaComPilhas() {
		this.p1 = new PilhaComLista();
		this.p2 = new PilhaComLista();
	}

	@Override
	public void enqueue(int element) throws Exception {
		p1.push(element);
	}

	@Override
	public int dequeue() throws Exception {
		while(!(p1.isEmpty()))
			p2.push(p1.pop());
		int k = p2.pop();
		while(!(p2.isEmpty()))
			p1.push(p2.pop());
		return k;
	}

	@Override
	public int head() throws Exception {
		while(!(p1.isEmpty()))
			p2.push(p1.pop());
		int k = p2.top();
		while(!(p2.isEmpty()))
			p1.push(p2.pop());
		return k;
	}

	@Override
	public boolean isEmpty() {
		return p1.isEmpty();
	}

	@Override
	public boolean isFull() {
		return p1.isFull();
	}

}