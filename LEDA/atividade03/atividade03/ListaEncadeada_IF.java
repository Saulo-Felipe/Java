package atividade03;

/*
 * Interface para implementação da classe "ListaEncadeada"
 * que deve ser implementada usando métodos recursivos
 * considerando sempre uma lista de números inteiros não negativos.
 */
public interface ListaEncadeada_IF {
	public boolean isEmpty();
	public int size();
	public int search(int element) throws Exception; //lançar exceção caso não encontre
	public void insert(int element); //deve-se inserir no início da lista
	public void remove(int element);
	public int[] toArray();
}