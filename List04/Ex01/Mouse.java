package List04.Ex01;

public class Mouse {
  private boolean possuiLed;
  private String fioOuBluetooh;
  private String cor;
  
  Mouse(boolean possuiLed, String fioOuBluetooh, String cor) {
    this.possuiLed = possuiLed;
    this.fioOuBluetooh = fioOuBluetooh;
    this.cor = cor;
  }

  boolean getPossuiLed() {
    return this.possuiLed;
  }

  String getFioOuBluetooh() {
    return this.fioOuBluetooh;
  }

  String getCor() {
    return this.cor;
  }
}
