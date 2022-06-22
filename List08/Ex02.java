public class Ex02 {
  public static void main(String[] args) {
    Quadrado quadrado = new Quadrado();
    Retangulo retangulo = new Retangulo();

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
  
  Quadrado() {
    this.altura = 2;
    this.largura = 4;
  }

}

class Retangulo extends FiguraAbstrata {
  Retangulo() {
    this.altura = 4;
    this.largura = 16;
  }
}
