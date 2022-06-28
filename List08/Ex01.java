import java.util.ArrayList;

class Ex01 {
  public static void main(String[] args) {
    ArrayList<Livros> livros = new ArrayList<Livros>();

    livros.add( new Livros("Livro 1", "Saulo", Livros.tipoGenero[0], "Saulos editora", "1ª") );
    livros.add( new Livros("Livro 2", "Saulo 2", Livros.tipoGenero[1], "Saulos editora", "edição 2") );
    livros.add( new Livros("Livro 3", "Saulo 3", Livros.tipoGenero[2], "Saulos editora", "edição 3") );

    for (Livros livro: livros) {
      System.out.println(livro.toString());
    }
    
  }
}

class Livros {
  private String titulo, autor, genero, editora, edicao;
  static String[] tipoGenero = {"ficção", "ciências naturais", "literatura", "ciências humanas"};

  Livros(String titulo, String autor, String genero, String editora, String edicao) {
    this.titulo = titulo;
    this.autor = autor;
    this.genero = genero;
    this.editora = editora;
    this.edicao = edicao;
  }

  String getTitulo() {
    return this.titulo;
  } 
  String getAutor() {
    return this.autor;
  } 
  String getGenero() {
    return this.genero;
  } 
  
  String getEditora() {
    return this.editora;
  } 

  String getEdicao() {
    return this.edicao;
  }

  void setTitulo(String titulo) {
    this.titulo = titulo;
  } 
  void setAutor(String autor) {
    this.autor = autor;
  } 
  void setGenero(String genero) {
    this.genero = genero;
  } 
  
  void setEditora(String editora) {
    this.editora = editora;
  } 

  void setEdicao(String edicao) {
    this.edicao = edicao;
  }

  @Override
  public String toString() {
    return this.titulo + ", " + this.autor + ", " + this.genero + ", " + this.editora + ", " + this.edicao;
  }
}