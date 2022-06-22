class Ex01 {
  public static void main(String[] agrs) {
    // O atributo estatico pode ser alterado via:

    // Object
    new Livro("livro 1", "Saulo", "Ciências Humanas", "hello world", "1.2");

    // E diretamente pela classe
    Livro.autor = "Teste";
  }
}

class Livro {
  public static String titulo, autor, genero, editora, edicao;

  Livro(String titulo, String autor, String genero, String editora, String edicao) {
    Livro.titulo = titulo;
    Livro.autor = autor; 
    Livro.genero = genero; 
    Livro.editora = editora; 
    Livro.edicao = edicao;
  }
}