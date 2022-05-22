package List04;

public class Ex01 {
  public static void main(String[] args) {
    Notebook notebook = new Notebook(true, 10, 2);

    System.out.println(notebook.getTempoDeInicializacao());
    System.out.println(notebook.getTemCamera());
    System.out.println(notebook.getDuracaoBateria());
  }

  public static class Notebook {
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
}
