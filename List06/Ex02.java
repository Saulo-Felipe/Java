package List06;
import java.util.ArrayList;

class Ex02 {
  public static void main(String[] args) {
    CadastrarPessoa cadastroPessoa = new CadastrarPessoa();

    cadastroPessoa.cadastrarPessoa(new Cliente(1000, "saulo cliente", "2312321321321"));
    cadastroPessoa.cadastrarPessoa(new Pessoa("Saulo", "149.813.054-27"));
    cadastroPessoa.cadastrarPessoa(new Funcionario("2132131", 10000, "saulo funcionario", "321213"));
    cadastroPessoa.cadastrarPessoa(new Gerente(2321, "saulo gerente", "32432432"));

    cadastroPessoa.mostrarCadastro();
  }
}

class CadastrarPessoa {
  public ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
  public int quantAtual = 0;

  public void cadastrarPessoa(Pessoa pessoa) {
    pessoas.add(pessoa);
    quantAtual++;
  }

  public void mostrarCadastro() {
    for (int c = 0; c < quantAtual; c++) {
      pessoas.get(c).mostrarDados();;
    }
  }
}

class Pessoa {
  String nome = "Nome não cadastrado";
  String cpf = "CPf não cadastrado";

  Pessoa() {}

  Pessoa(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public void mostrarDados() {
    System.out.println("[Pessoa] Nome: "+this.nome + ", CPF: "+this.cpf);
  }
}

class Cliente extends Pessoa {
  int codigo = 0;

  Cliente() {}

  Cliente(int codigo, String nome, String cpf) {
    super(nome, cpf);

    this.codigo = codigo;
  }

  @Override
  public void mostrarDados() {
    System.out.println("[Cliente] Código: "+this.codigo+", Nome: "+this.nome + ", CPF: "+this.cpf);
  }
}

class Funcionario extends Pessoa {
  String matricula = "Matricula não cadastrada";
  double salario = 0.0;

  Funcionario() {}

  Funcionario(String matricula, double salario, String nome, String cpf) {
    super(nome, cpf);

    this.matricula = matricula;
    this.salario = salario;
  }

  @Override
  public void mostrarDados() {
    System.out.println("[Funcionario] Matricula: "+this.matricula + ", Salario: "+this.matricula+", Nome: "+this.nome + ", CPF: "+this.cpf);
  }
}

class Gerente extends Pessoa {
  int area = 0;

  Gerente() {}

  Gerente(int area, String nome, String cpf) {
    super(nome, cpf);

    this.area = area;
  }

  @Override
  public void mostrarDados() {
    System.out.println("[Gerente] Área: "+this.area+" Nome: "+this.nome + ", CPF: "+this.cpf);
  }
}