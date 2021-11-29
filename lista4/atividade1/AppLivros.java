package lista4.atividade1;

public class AppLivros {
    public static void main(String[] args) {
        Livro l1, l2, l3;
        l1 = new Livro(1, "Object-Oriented Programming and Java", 30000);
        l2 = new Livro(2, "Object-Oriented Software Construction", 22000);
        l3 = new Livro(3, "Object-Oriented Analysis and Design with Applications", 8500);

        System.out.println("Quantidade de exemplares de \"" + l1.getNome() + "\":");
        System.out.println(l1.getQuantExemplares());
        System.out.println("Quantidade de exemplares de \"" + l2.getNome() + "\":");
        System.out.println(l2.getQuantExemplares());
        System.out.println("Quantidade de exemplares de \"" + l3.getNome() + "\":");
        System.out.println(l3.getQuantExemplares());

        l1.setQuantExemplares(31000);
        l2.setQuantExemplares(23000);
        l3.setQuantExemplares(9500);

        System.out.println("\nNova quantidade de exemplares de \"" + l1.getNome() + "\":");
        System.out.println(l1.getQuantExemplares());
        System.out.println("Nova quantidade de exemplares de \"" + l2.getNome() + "\":");
        System.out.println(l2.getQuantExemplares());
        System.out.println("Nova quantidade de exemplares de \"" + l3.getNome() + "\":");
        System.out.println(l3.getQuantExemplares());
    }
}
