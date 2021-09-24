package Lista2.Atividade10;

import java.util.Scanner;

public class AppQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado();
        Quadrado q3 = new Quadrado();

        System.out.println("Lado do quadrado 1: ");
        q1.setLado(sc.nextDouble());
        System.out.println("Lado do quadrado 2: ");
        q2.setLado(sc.nextDouble());
        System.out.println("Lado do quadrado 3: ");
        q3.setLado(sc.nextDouble());

        double maiorArea;
        double menorPerimetro;

        maiorArea = q1.getArea() >= q2.getArea() ? q1.getArea() : q2.getArea();
        maiorArea = q3.getArea() >= maiorArea ? q3.getArea() : maiorArea;

        menorPerimetro = q1.getPerimetro() <= q2.getPerimetro() ? q1.getPerimetro() : q2.getPerimetro();
        menorPerimetro = q3.getPerimetro() <= menorPerimetro ? q3.getPerimetro() : menorPerimetro;

        System.out.println("Maior area: " + maiorArea);
        System.out.println("Menor perimetro: " + menorPerimetro);
    }
}
