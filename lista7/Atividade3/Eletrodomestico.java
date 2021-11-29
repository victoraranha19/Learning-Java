package lista7.Atividade3;

public class Eletrodomestico {
    private boolean ligado;

    public Eletrodomestico() {
        this.ligado = false;
    }

    public void ligar() {
        System.out.println("ligando...");
        this.ligado = true;
        agir();
    }
    public void desligar() {
        System.out.println("desligando...");
        this.ligado = false;
    }

    public void imprimir() {
        System.out.println("Ligado = " + ligado);
    }

    public void agir() {}
}
