package Ex02;

import java.util.HashSet;

class part1 {
  public static void main(String[] args) {
    HashSet<String> listaDeCompras = new HashSet<String>();

    listaDeCompras.add("Miojo");
    listaDeCompras.add("Pizza");
    listaDeCompras.add("Coca-cola");
    listaDeCompras.add("Cheetos");
    listaDeCompras.add("Doces em geral");
    listaDeCompras.add("Lasanha");
    listaDeCompras.add("ração para calopsita"); // Item desconsiderado, pois é igual ao de baixo.
    listaDeCompras.add("ração para calopsita"); 

    for (String i: listaDeCompras) {
      System.out.println("-> "+i);
    }

    listaDeCompras.remove("Miojo");
    listaDeCompras.clear();
  }
}
