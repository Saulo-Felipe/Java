package Ex02;

import java.util.ArrayList;

class part2 {
  public static void main(String[] args) {
    ArrayList<String> listaDeCompras = new ArrayList<String>();

    listaDeCompras.add("Miojo");
    listaDeCompras.add("Pizza");
    listaDeCompras.add("Coca-cola");
    listaDeCompras.add("Cheetos");
    listaDeCompras.add("Doces em geral");
    listaDeCompras.add("Lasanha");
    listaDeCompras.add("ração para calopsita");

    listaDeCompras.remove("ração para calopsita");

    
    listaDeCompras.remove(0);
    
    for (String i: listaDeCompras) {
      System.out.println("-> "+i);
    }

    listaDeCompras.clear();
  }
}
