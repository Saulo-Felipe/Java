package List04.Ex02;

public class Main {
  public static void main(String[] args) {
    Carro carro = new Carro("Lamborghini", "Huracan", 2014, "flex");

    System.out.println(carro.marca);
    System.out.println(carro.anoDeFabrica);
    System.out.println(carro.tipoDeCombustivel);
    System.out.println(carro.modelo);
  }
}
