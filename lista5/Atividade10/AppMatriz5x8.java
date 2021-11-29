package lista5.Atividade10;

import java.util.Scanner;

public class AppMatriz5x8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char menu;
        int [][] matriz = new int [5][8];

        System.out.println("Entre com uma matriz numerica de ordem 5x8:");
        for (int i=0; i<5; i++) {
            for (int j=0; j<8; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        do {
            System.out.println("\nDigite um valor para consultar:");
            int val = sc.nextInt();
    
            System.out.print("\nO valor escolhido se encontra na(s) posicao(oes): ");
            boolean naMatriz = false;
            for (int i=0; i<5; i++) {
                for (int j=0; j<8; j++) {
                    if (val == matriz[i][j]) {
                        System.out.print("[" + i + "][" + j + "] ");
                        naMatriz = true;
                    }
                }
            }
            if (naMatriz==false) {
                System.out.println("\nerror: valor nao armazenado na matriz");
            }
    
            System.out.println("\nFazer nova consulta?");
            System.out.println("S / N");
            
            menu = sc.next().charAt(0);

        } while (menu == 'S' || menu == 's');
        sc.close();
    }
}
