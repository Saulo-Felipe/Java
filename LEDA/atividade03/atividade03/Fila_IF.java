package atividade03;

/*
 * Interface para implementação da classe "FilaComPilhas", a qual deve
 * ser implementada usando duas instâncias da classe "PilhaComLista".
 */
public interface Fila_IF {
	public void enqueue(int element) throws Exception;
	public int dequeue() throws Exception;
	public int head() throws Exception;
	public boolean isEmpty();
	public boolean isFull();
}
