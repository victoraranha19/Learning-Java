package Lista2.Atividade8;

import java.util.Scanner;

public class AppTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo t = new Triangulo();

        System.out.println("Digite 3 valores:");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();

        if ((x+y) > z && (x+z) > y && (y+z) > x) {
            t.setLados(x, y, z);
            System.out.println("Forma um triangulo: " + t.getTipo());
        }
        else 
            System.out.println("Não forma um triangulo");
    }
}