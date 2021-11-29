package lista7.Atividade5;

public class Peixe extends Animal {
    public Peixe(double massa, String tamanho) {
        this.massa = massa;
        this.tamanho = tamanho;
    }

    @Override
    public void movimentar() {
        System.out.println("nadando...");
    }
    @Override
    public void comunicar() {
        System.out.println("glub glub...");
    }
}
