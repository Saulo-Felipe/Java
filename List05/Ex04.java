package List05;

class Livro {
  String titulo = "Os Segredos da Mente Milionária";
  String autor = "T. Harv Eker";
  int capitulo = 15;
  Editora editora = new Editora("Sextante", "Geraldo Jordão Pereira", 1998);
}

class Editora {
  String nome;
  String fundador;
  int fundacao;

  Editora(String n, String f, int fu) {
    this.nome = n;
    this.fundador = f;
    this.fundacao = fu;
  }
}
