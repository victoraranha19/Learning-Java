package lista7.atividade5;

public class Homem extends Animal {
    public Homem(double massa, String tamanho) {
        this.massa = massa;
        this.tamanho = tamanho;
    }

    @Override
    public void movimentar() {
        System.out.println("andando...");
    }
    @Override
    public void comunicar() {
        System.out.println("falando...");
    }
}
