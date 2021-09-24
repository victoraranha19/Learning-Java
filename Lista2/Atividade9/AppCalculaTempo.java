package Lista2.Atividade9;

import java.util.Scanner;

public class AppCalculaTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tempo t1 = new Tempo();
        Tempo t2 = new Tempo();

        System.out.println("\nTEMPO 1");
        System.out.println("Digite o valor...");
        System.out.print("da hora: ");
        t1.setHora(sc.nextInt());
        System.out.print("dos minutos: ");
        t1.setMinuto(sc.nextInt());
        System.out.print("dos segundos: ");
        t1.setSegundo(sc.nextInt());

        System.out.println("\nTEMPO 2");
        System.out.println("Digite o valor...");
        System.out.print("da hora: ");
        t2.setHora(sc.nextInt());
        System.out.print("dos minutos: ");
        t2.setMinuto(sc.nextInt());
        System.out.print("dos segundos: ");
        t2.setSegundo(sc.nextInt());

        int dif = t2.getTempoTot() - t1.getTempoTot();
        System.out.print("\nDiferenca de tempo = " + dif + " segundo(s)");
    }
}
