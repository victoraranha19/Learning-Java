package lista5.atividade1;

import java.util.Scanner;

public class AppDezInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num [] = new int [10];
        
        System.out.println("Digite 10 numeros inteiros:");
        for (int i=0; i < 10; i++)
            num[i] = sc.nextInt();
        
        int pares=0, impares=0;

        System.out.println("\nNumeros pares:");
        for (int i=0; i < 10; i++) {
            if (num[i]%2 == 0) {
                System.out.print(num[i] + " ");
                pares++;
            }
        }

        System.out.println("\nNumeros impares:");
        for (int i=0; i < 10; i++) {
            if (num[i]%2==1) {
                System.out.print(num[i] + " ");
                impares++;
            }
        }
        sc.close();
        
        System.out.println("\nQuantidade de numeros pares: " + pares);
        System.out.println("Quantidade de numeros impares: " + impares);
    }
}