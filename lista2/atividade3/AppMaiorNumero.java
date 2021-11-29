package lista2.atividade3;

import java.util.Scanner;

public class AppMaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2;

        System.out.println("Digite dois numero:");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        sc.close();

        float maior = num1 > num2 ? num1 : num2;
        System.out.println("Maior = " + maior);
    }
}
