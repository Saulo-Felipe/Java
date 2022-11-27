package atividade03;

/*
 * Interface para implementação da classe "PilhaComLista",
 * que deve ser implementada usando uma lista encadeada
 * com capacidade máxima de 10 elementos.
 */
public interface Pilha_IF {
	public void push(int element) throws Exception;
	public int pop() throws Exception;
	public int top() throws Exception;
	public boolean isEmpty();
	public boolean isFull();
}
