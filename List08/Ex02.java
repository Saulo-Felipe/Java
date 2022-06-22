public class Ex02 {
  public static void main(String[] args) {
    Quadrado quadrado = new Quadrado(2, 4);
    Quadrado retangulo = new Quadrado(4, 16);

    quadrado.desenha();
    retangulo.desenha();
  }  
}

abstract class FiguraAbstrata {
  int altura, largura;

  public void desenhLinha() {
    System.out.print(" ");
    for (int j = 0; j < largura; j++)
      System.out.print("-");
  }
  
  public void desenha() {
    desenhLinha();

    System.out.println();

    for (int k = 0; k < altura; k++) {
      System.out.print("|");
      
      for (int j = 0; j < largura; j++) {
        System.out.print(" ");
      }

      System.out.print("|");
      System.out.println();
    }
  
    desenhLinha();
    System.out.println();
  }
}

class Quadrado extends FiguraAbstrata {
  
  Quadrado(int altura, int largura) {
    this.altura = altura;
    this.largura = largura;
  }

}
