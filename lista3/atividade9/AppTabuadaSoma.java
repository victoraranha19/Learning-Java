package lista3.atividade9;

import java.util.Scanner;

public class AppTabuadaSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;

        do {
            System.out.println("Digite um numero inteiro positivo: ");
            num = sc.nextInt();
        } while (num<0);
        sc.close();
        
        for (int i = 1; i <= 10; i++) {
            int soma = num + i;
            System.out.println(num + " + " + i + " = " + soma);
        }
    }
}
