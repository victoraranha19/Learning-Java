package lista5.atividade3;

import java.util.Scanner;

public class AppMatriz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [][] matrizM = new double [4][4];
        double maior=0;

        System.out.println("Insira os valores da matriz M(4 x 4):");
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                matrizM[i][j] = sc.nextDouble();

                if (i==0 && j==0)
                    maior = matrizM[0][0];
                
                maior = matrizM[i][j] > maior ? matrizM[i][j] : maior;
            }
        }

        double [][] matrizR = new double [4][4];

        System.out.println("\nMatriz R(4 x 4):");
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                matrizR[i][j] = matrizM[i][j] * maior;
                System.out.print(matrizR[i][j] + " ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
