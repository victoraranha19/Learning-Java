package lista3.atividade7;

import java.util.Scanner;

public class AppNumPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        sc.close();

        boolean ehPrimo = conferirPrimo(num);

        if (ehPrimo)
            System.out.println(num + " eh primo!");
        else
            System.out.println(num + " nao eh primo!");
    }

    public static boolean conferirPrimo(int n) {
        int cont=0;
        for (int i = 1; i <= n; i++)
            if (n%i == 0)
                cont++;
        if (cont == 2)
            return true;
        return false;
    }
}
