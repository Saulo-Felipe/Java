package List05;

class Monstro {
  int cabeca = 2;
  int olhos = 3;
  int boca = 1;
  int braco = 4;
  Perna perna = new Perna(2, 20, 10);
}

class Perna {
  int pes;
  int unhas;
  int dedos;

  Perna(int pes, int unhas, int dedos) {
    this.pes = pes;
    this.unhas = unhas;
    this.dedos = dedos;      
  }
}
