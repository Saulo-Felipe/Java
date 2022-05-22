package List04.Ex03;

public class Conta {
  private int numeroDaConta;
  private double saldo;

  Conta(int numeroDaConta, double saldoInicial) {
    this.numeroDaConta = numeroDaConta;
    this.saldo = saldoInicial;
  }

  void depositar(double valorParaDeposito) {
    this.saldo += valorParaDeposito;
  }

  void sacar(double valorParaSacar) {
    this.saldo -= valorParaSacar;
  }

  double verificarSaldo() {
    return this.saldo;
  }

  int verificarNumeroDaConta() {
    return this.numeroDaConta;
  }
}
