package lista5.atividade9;

import java.util.Scanner;

public class AppDoisVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] x = new int [10];
        int [] y = new int [10];

        System.out.println("Digite 10 inteiros para o vetor X:");
        for (int i=0; i<10; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("\nDigite 10 inteiros para o vetor Y:");
        for (int i=0; i<10; i++) {
            y[i] = sc.nextInt();
        }
        sc.close();

        int [] xy = new int [20];
        for (int i=0, j=10; i<10; i++, j++) {
            xy[i] = x[i];
            xy[j] = y[i];
        }

        System.out.println("\n\nUniao dos vetores X e Y:");
        System.out.print(xy[0] + " ");
        for (int i=1; i<20; i++) {
            boolean repeticao = false;

            for (int j=0; j<i; j++) {
                if (xy[i] == xy[j])
                    repeticao = true;
            }

            if (repeticao == false)
                System.out.print(xy[i] + " ");
        }

        System.out.println("\nDiferenca dos vetores X e Y:");
        for (int i=0; i<10; i++) {
            boolean repeticao = false;
            boolean existeY = false;

            for (int j=0; j<i; j++)
                if (x[i] == x[j])
                    repeticao = true;

            for (int j=0; j<10; j++)
                if (x[i] == y[j])
                    existeY = true;

            if (repeticao == false && existeY == false)
                System.out.print(x[i] + " ");
        }

        System.out.println("\nInterseccao dos vetores X e Y:");
        for (int i=0; i<10; i++) {
            boolean repeticao = false;
            boolean existeY = false;

            for (int j=0; j<i; j++)
                if (x[i] == x[j])
                    repeticao = true;

            for (int j=0; j<10; j++)
                if (x[i] == y[j])
                    existeY = true;

            if (repeticao == false && existeY == true)
                System.out.print(x[i] + " ");
        }
    }
}
