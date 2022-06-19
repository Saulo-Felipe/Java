package Ex02;

import java.util.HashMap;

class part3 {
  public static void main(String[] args) {
    HashMap<Integer, String> listaDeCompras = new HashMap<Integer, String>();
    
    
    listaDeCompras.put(1, "Pizza");
    listaDeCompras.put(2, "Coca-cola");
    listaDeCompras.put(3, "Cheetos");
    listaDeCompras.put(4, "Doces em geral");
    listaDeCompras.put(5, "Lasanha");
    listaDeCompras.put(6, "ração para calopsita"); // Item desconsiderado, pois o index é igual ao de baixo.
    listaDeCompras.put(6, "ração para calopsita"); 
  
    for (String i: listaDeCompras.values()) {
      System.out.println("-> "+i);
    }
  
    listaDeCompras.remove(0);
    listaDeCompras.clear();
  }
}
