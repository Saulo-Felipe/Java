package List04.Ex01;

public class Principal {
  public static void main(String[] args) {
    Celular celular = new Celular(90, "Samsung", 4);
    Notebook notebook = new Notebook(true, 10, 2);
    Mouse mouse = new Mouse(true, "bluetooh", "preto");

    System.out.println(celular.getMarca());
    System.out.println(notebook.getTempoDeInicializacao());
    System.out.println(mouse.getCor());
  }
}
