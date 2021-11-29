package lista3.atividade3;

import java.util.Scanner;

public class AppValorE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Para calcular E (E = 1 + 1/2 + 1/3 + ... + 1/N)");
        System.out.println("Digite um valor inteiro positivo para N: ");

        int num = sc.nextInt();
        double valorE = calcularE(num);
        sc.close();

        System.out.println("E = " + valorE);
    }

    public static double calcularE(int n) {
        double e = 0;
        for (int i = 1; i <= n; i++) {
            e += (1.0/i);
        }
        return e;
    }
}
