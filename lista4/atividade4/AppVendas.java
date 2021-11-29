package lista4.atividade4;

import java.util.Scanner;

public class AppVendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p1, p2, p3;

        p1 = new Produto();
        System.out.println("\nProduto 1:");        
        System.out.println("Nome:");
        p1.setNome(sc.nextLine());
        System.out.println("Preco do custo:");
        p1.setPrecoCusto(sc.nextDouble());
        System.out.println("Preco da venda:");
        p1.setPrecoVenda(sc.nextDouble());
        clearBuffer(sc);

        p2 = new Produto();
        System.out.println("\nProduto 2:");
        System.out.println("Nome:");
        p2.setNome(sc.nextLine());
        System.out.println("Preco do custo:");
        p2.setPrecoCusto(sc.nextDouble());
        System.out.println("Preco da venda:");
        p2.setPrecoVenda(sc.nextDouble());
        clearBuffer(sc);

        p3 = new Produto();
        System.out.println("\nProduto 3:");
        System.out.println("Nome:");
        p3.setNome(sc.nextLine());
        System.out.println("Preco do custo:");
        p3.setPrecoCusto(sc.nextDouble());
        System.out.println("Preco da venda:");
        p3.setPrecoVenda(sc.nextDouble());

        System.out.println("\n  Margem de lucro  ");
        System.out.println("[Produto] | [Moeda] - [Percentual]");
        System.out.print(p1.getNome() + " | ");
        System.out.printf("%.2f - %.2f\n", p1.calcularMargemLucro(), p1.getMargemLucroPorcentagem());
        System.out.print(p2.getNome() + " | ");
        System.out.printf("%.2f - %.2f\n", p2.calcularMargemLucro(), p2.getMargemLucroPorcentagem());
        System.out.print(p3.getNome() + " | ");
        System.out.printf("%.2f - %.2f\n", p3.calcularMargemLucro(), p3.getMargemLucroPorcentagem());
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
