package lista6.atividade3;

import java.util.Scanner;

public class AppImovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nCriando um imóvel...\n");

        System.out.println("Digite 1 para imovel novo");
        System.out.println("Digite 2 para imovel velho");
        int i = sc.nextInt();
        sc.nextLine();

        System.out.println("\nDigite o endereco:");
        String end = sc.nextLine();
        System.out.println("Digite o preco:");
        double preco = sc.nextDouble();

        if (i==1) {
            ImovelNovo imovel = new ImovelNovo(end, preco);
            System.out.println("\nPreco do imovel novo com adicional de 10%:");
            System.out.printf("R$ %.2f", imovel.getPreco());
        }
        if (i==2) {
            ImovelVelho imovel = new ImovelVelho(end, preco);
            System.out.println("\nPreco do imovel velho com desconto de 30%:");
            System.out.printf("R$ %.2f", imovel.getPreco());
        }

        sc.close();
    }
}
