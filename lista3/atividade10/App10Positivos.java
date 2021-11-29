package lista3.atividade10;

import java.util.Scanner;

public class App10Positivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont=1;
        float maior=0, soma=0;
        do {
            System.out.println("\nDigite um valor posivito:");
            float num = sc.nextFloat();

            if (num>0) {
                cont++;
                maior = num>maior ? num : maior;
                soma += num;
            }
            else 
                System.out.println("Error (valor nao positivo)");
        } while(cont<=10);
        sc.close();

        float media = soma/10;

        System.out.println("\nMaior: " + maior);
        System.out.println("Soma: " + soma);
        System.out.println("Media Aritmetrica: " + media);
    }
}
