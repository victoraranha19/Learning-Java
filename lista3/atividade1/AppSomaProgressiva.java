package lista3.atividade1;

import java.util.Scanner;

public class AppSomaProgressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores para imprimir a soma entre eles:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        int soma;
        soma = somarFor(num1, num2);
        //soma = somarWhile(num1, num2);
        //soma = somarDoWhile(num1, num2);

        System.out.println(soma);
    }

    public static int somarFor(int n1, int n2) {
        int total=0;
        for (int i = n1+1; i < n2; i++) {
            total += i;
        }
        return total;
    }

    public static int somarWhile(int n1, int n2) {
        int total=0;
        n1 += 1;
        while (n1<n2) {
            total+=n1;
            n1++;
        }
        return total;
    }

    public static int somarDoWhile(int n1, int n2) {
        int total=0;
        n1 += 1;
        do {
            total+=n1;
            n1++;
        } while (n1<n2);
        return total;
    }
}
