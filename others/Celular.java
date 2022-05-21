package others;

class Celular {
    int telaTamanho;
    int ram;
    int memoria;

    Celular(int telaTamanho, int ram, int memoria) {
        this.telaTamanho = telaTamanho;
        this.ram = ram;
        this.memoria = memoria;
    }

    public void setCelular(int telaTamanho, int ram, int memoria) {
        this.telaTamanho = telaTamanho;
        this.ram = ram;
        this.memoria = memoria;
    }

    public int gettelaTamanho() {
        return this.telaTamanho;
    }

    
    public int getRam() {
        return this.ram;
    }
    
    public int getMemoria() {
        return this.memoria;
    }
}
