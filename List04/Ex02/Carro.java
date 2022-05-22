package List04.Ex02;

public class Carro { // Não criei os métodos gets, pois os atributos já estão disponiveis publicamente.
  public String marca;
  public String modelo;
  public int anoDeFabrica;
  public String tipoDeCombustivel;

  Carro(String marca, String modelo, int anoDeFabrica, String tipoDeCombustivel) {
    this.marca = marca;
    this.modelo = modelo;
    this.anoDeFabrica = anoDeFabrica;
    this.tipoDeCombustivel = tipoDeCombustivel;
  }
}
