package lista5.atividade2;

import java.util.Scanner;

public class AppArrayInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num [] = new int [10];

        int maior=0;
        int menor=0;

        System.out.println("Digite 10 numeros inteiros:");
        for (int i=0; i<10; i++) {
            num[i] = sc.nextInt();
            if (i==0) {
                maior = num[0];
                menor = num[0];
            }

            maior = (num[i] > maior) ? num[i] : maior;
            menor = (num[i] < menor) ? num[i] : menor;
        }
        sc.close();

        System.out.println("Maior valor do array: " + maior);
        System.out.println("Menor valor do array: " + menor);
    }
}
