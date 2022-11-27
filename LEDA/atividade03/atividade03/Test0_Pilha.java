package atividade03;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class Test0_Pilha {

	private static Pilha_IF p ;
	
	@Before //Instanciando a Pilha antes de cada teste
	public void instanciaPilha() throws Exception{
		p = new PilhaComLista();
	}
	
	@Test
	public void testVazia() throws Exception{
		assertTrue(p.isEmpty());
	}
	
	//Outros testes ...
	
}
