package List05;

public class Ex02 {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();
    System.out.println(pessoa.dataNasc.ano);
  }
}

class Pessoa {
  String nome = "Saulo";
  Data dataNasc = new Data(17, 02, 2004);
  Endereco endereco = new Endereco("rua turusbagos", 641, "turusbengo", "inga", "pb", "58380-000");
  Contato contato = new Contato("8332212494", "(83) 99383-9421", "saulo@gmail.com");

}

class Data {
  int dia;
  int mes;
  int ano;

  Data(int d, int m, int a) {
    this.dia = d;
    this.mes = m;
    this.ano = a;
  }
}

class Endereco {
  String logradouro;
  int numero;
  String bairro;
  String cidade;
  String estado;
  String cep;

  Endereco(String l, int n, String b, String ci, String e, String c) {
    this.logradouro = l;
    this.numero = n;
    this.bairro = b;
    this.estado = e;
    this.cep = c;
  }
}

class Contato {
  String telefoneResid;
  String celular;
  String email;

  Contato(String t, String c, String e) {
    this.telefoneResid = t;
    this.celular = c;
    this.email = e;
  }
}
