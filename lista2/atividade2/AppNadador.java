package lista2.atividade2;

import java.util.Scanner;

public class AppNadador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nadador fulano = new Nadador();

        System.out.println("Idade do nadador: ");
        fulano.setIdade(sc.nextInt());
        sc.close();

        System.out.println("Categoria: " + fulano.getCategoria());
    }
}
