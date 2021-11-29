package lista5.Atividade8;

import java.util.Scanner;

public class AppVetorPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int [10];

        System.out.println("Digite 10 numeros inteiros:");
        for (int i=0; i<10; i++)
            num[i] = sc.nextInt();
        sc.close();
        
        System.out.println("Numero primo - [Posicao no array (inclui 0)]");
        for (int i = 0; i < num.length; i++) {
            if (verificarPrimo(num[i]))
                System.out.println(num[i] + " - [" + i + "]");
        }
    }

    public static boolean verificarPrimo(int n) {
        if (n==1)
            return false;
        if (n==2)
            return true;
        for (int i=2; i<n; i++) {
            if (n%i == 0)
                return false;
        }
        return true;
    }
}
