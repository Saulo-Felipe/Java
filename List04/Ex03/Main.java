package List04.Ex03;

public class Main {
  public static void main(String[] args) {
    Conta corrente = new Conta(12345, 100);
    Conta poupanca = new Conta(223344, 150);

    corrente.depositar(250);
    corrente.sacar(50);

    poupanca.depositar(500);
    poupanca.sacar(600);

    System.out.println(corrente.verificarSaldo());
    System.out.println(poupanca.verificarSaldo());

  }
}
