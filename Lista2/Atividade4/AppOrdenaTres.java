package lista2.atividade4;

import java.util.Scanner;

public class AppOrdenaTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TresNumeros list = new TresNumeros();

        System.out.println("Digite tres numeros: ");
        list.setNumero1(sc.nextFloat());
        list.setNumero2(sc.nextFloat());
        list.setNumero3(sc.nextFloat());
        sc.close();

        float maior = list.getMaior();
        float menor = list.getMenor();
        float medio = list.getMedio();
        
        System.out.println("Crescente: ");
        System.out.printf("%.1f %.1f %.1f \n\n", menor, medio, maior);
        System.out.println("Drecescente: ");
        System.out.printf("%.1f %.1f %.1f", maior, medio, menor);
    }

}
