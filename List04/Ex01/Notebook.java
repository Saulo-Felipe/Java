package List04.Ex01;

class Notebook {
  private boolean temCamera;
  private int tempoDeInicializacao;
  private double duracaoBateria;

  Notebook(boolean temCamera, int tempoDeInicializacao, double duracaoBateria) {
    this.temCamera = temCamera;
    this.tempoDeInicializacao = tempoDeInicializacao;
    this.duracaoBateria = duracaoBateria;
  } 

  boolean getTemCamera() {
    return this.temCamera;
  }

  int getTempoDeInicializacao() {
    return this.tempoDeInicializacao;
  }

  double getDuracaoBateria() {
    return this.duracaoBateria;
  }
}