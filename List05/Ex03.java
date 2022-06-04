package List05;

class Computador {
  String teclado = "Samsung";
  int monitor = 24;
  int memoria = 32;
  PlacaMae placaMae = new PlacaMae("ASUS", "Foxconn", "preto");
}


class PlacaMae {
  String marca;
  String fabricante;
  String cor;

  PlacaMae(String marca, String fabricante, String cor) {
    this.marca = marca;
    this.fabricante = fabricante;
    this.cor = cor;  
  }
}
