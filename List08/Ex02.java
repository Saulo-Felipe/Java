class Ex02 {
  public static void main(String[] args) {
    Quadrado quadrado = new Quadrado(4, 5, 5);
    Trapezio trapezio = new Trapezio(4, 5, 4);
    Triangulo triangulo = new Triangulo(3, 6, 2);

    quadrado.desenha();
    trapezio.desenha();
    triangulo.desenha();
  }
}

abstract class FiguraAbstrata {
  public int quantLados;
  public double altura, largura;

  protected abstract void desenha();

  FiguraAbstrata(int quantLados, double altura, double largura) {
    this.quantLados = quantLados;
    this.altura = altura;
    this.largura = largura;
  };
}

class Trapezio extends FiguraAbstrata {
  
  Trapezio(int quantLados, double altura, double largura) {
    super(quantLados, altura, largura);
  }

  @Override
  protected void desenha() {
    System.out.println("Desenhando trapezio...");    
  }
}

class Quadrado extends FiguraAbstrata {
  
  Quadrado(int quantLados, double altura, double largura) {
    super(quantLados, altura, largura);
  }

  @Override
  protected void desenha() {
    System.out.println("Desenhando Quadrado...");    
  }
}

class Triangulo extends FiguraAbstrata {
  
  Triangulo(int quantLados, double altura, double largura) {
    super(quantLados, altura, largura);
  }

  @Override
  protected void desenha() {
    System.out.println("Desenhando Triangulo...");    
  }
}