package List06;

public class Ex01 { // Testar tudo 
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Saulo", "149.813.054-28", "17-02-2004");
    Funcionario funcionario = new Funcionario("211080276", "04-06-2022", 2000, "143.121.123-43", "Elisangela", "2002");   
    Aluno aluno = new Aluno("211080276", "Martins", "213.211.094-12", "2012-21221-1");
    ChefeDepartamento chefeDepartamento = new ChefeDepartamento(
      "C. Tecnologia", 
      "04-02-2022", 
      1000, 
      "221221233", 
      "21-123-12", 
      5000, 
      "212.212.121-21", 
      "Marileide", 
      "93-21-2003"
    );

    pessoa.mostrarPessoa();
    funcionario.mostrarFuncionario();
    aluno.mostrarAluno();
    chefeDepartamento.mostrarChefeDepartamento();
  }
}

class Pessoa {
  String nome;
  String cpf;
  String dataNasc;

  Pessoa(String nome, String cpf, String dataNasc) {
    this.nome = nome;
    this.cpf = cpf;
    this.dataNasc = dataNasc;
  }

  public void mostrarPessoa() {
    System.out.println("Nome: " + this.nome + ", cpf: " + this.cpf + ", nascimento: " + this.dataNasc);
  }
}

class Funcionario extends Pessoa {
  String matricula;
  String dataAdmissao;
  double salario;

  Funcionario(String matricula, String dataAdmissao, double salario, String cpf, String nome, String dataNasc) {
    super(nome, cpf, dataNasc);

    this.matricula = matricula;
    this.dataAdmissao = dataAdmissao;
    this.salario = salario;
  }

  public void mostrarFuncionario() {
    this.mostrarPessoa();
    
    System.out.println("Matricula: " + this.matricula + ", Admissão: " + this.dataAdmissao + ", Salario: " + this.salario);
  }
}

class Aluno extends Pessoa {
  String matricula;

  Aluno(String matricula, String nome, String cpf, String dataNasc) {
    super(nome, cpf, dataNasc);

    this.matricula = matricula;
  }

  public void mostrarAluno() {
    this.mostrarPessoa();

    System.out.println("Matricula: " + this.matricula);
  }
}

class ChefeDepartamento extends Funcionario {
  String departamento;
  String dataPromocao;
  double gratificacao;

  ChefeDepartamento(String departamento, String dataPromocao, double gratificacao, String matricula, String dataAdmissao, double salario, String cpf, String nome, String dataNasc) {
    super(matricula, dataAdmissao, salario, cpf, nome, dataNasc);

    this.departamento = departamento;
    this.dataPromocao = dataPromocao;
    this.gratificacao = gratificacao;  
  }

  public void mostrarChefeDepartamento() {
    this.mostrarFuncionario();

    System.out.println("Departamento: "+this.departamento + ", Promoção: "+this.dataPromocao + ", Gratificação: "+this.gratificacao);
  }
}