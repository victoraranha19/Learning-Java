package lista7.Atividade3;

public class Principal {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        Batedeira bat = new Batedeira();
        Computador pc = new Computador();

        Eletrodomestico [] eletr = {tv, bat, pc};

        tv.ligar();
        bat.ligar();
        bat.desligar();
        pc.ligar();
        tv.desligar();
        pc.desligar();
    }
}
