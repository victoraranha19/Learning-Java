package lista7.atividade1;

import java.util.Scanner;

public class AppFigura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figura f = new Figura();

        System.out.println("Escolha uma figura:");
        System.out.println("C - circulo");
        System.out.println("Q - quadrado");
        System.out.println("T - triangulo");

        char tipo = sc.next().charAt(0);
        if (tipo == 'C' || tipo == 'c') {
            f.iniciarCirculo();
        }
        if (tipo == 'Q' || tipo == 'q') {
            f.iniciarQuadrado();
        }
        if (tipo == 'T' || tipo == 't') {
            f.iniciarTriangulo();
        }

        switch (tipo) {
            case 'C':
            case 'c':
                Circulo c = f.iniciarCirculo();
                System.out.printf("\nArea = %.2f", c.calcularArea());
                break;
            case 'Q':
            case 'q':
                Quadrado q = f.iniciarQuadrado();
                System.out.printf("\nArea = %.2f", q.calcularArea());
                break;
            case 'T':
            case 't':
                Triangulo t = f.iniciarTriangulo();
                System.out.printf("\nArea = %.2f", t.calcularArea());
                break;
            default:
                break;
        }
        sc.close();
    }
}
