package lista7.Atividade5;

public class Passaro extends Animal {
    public Passaro(double massa, String tamanho) {
        this.massa = massa;
        this.tamanho = tamanho;
    }

    @Override
    public void movimentar() {
        System.out.println("voando...");
    }
    @Override
    public void comunicar() {
        System.out.println("cantando...");
    }
}
