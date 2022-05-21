package List04.Ex01;

class Celular {
  private int porcentagemBateria, RAM;
  private String marca;

  Celular(int porcentagem, String marca, int RAM) {
    this.porcentagemBateria = porcentagem;
    this.RAM = RAM;
    this.marca = marca;
  }

  int getPorcentagemBateria() {
    return this.porcentagemBateria;
  }

  String getMarca() {
    return this.marca;
  }

  int getRam() {
    return this.RAM;
  }

}
