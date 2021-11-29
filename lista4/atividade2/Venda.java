package lista4.atividade2;

public class Venda {
    public static void main(String[] args) {
        Produto p1, p2;
        p1 = new Produto(1, "Arroz", 100, 9.99);
        p2 = new Produto(2, "Oleo", 150, 7.50);

        System.out.println("Quantidade inicial em estoque de \"" + p1.getNome() + "\":");
        System.out.println(p1.getQuantEstoque());
        System.out.println("Quantidade inicial em estoque de \"" + p2.getNome() + "\":");
        System.out.println(p2.getQuantEstoque());

        Item i1, i2, i3;
        i1 = new Item(11, p1, 2);
        i2 = new Item(12, p2, 3);
        i3 = new Item(13, p1, 5);

        System.out.println("Quantidade atual em estoque de \"" + p1.getNome() + "\":");
        System.out.println(p1.getQuantEstoque());
        System.out.println("Quantidade atual em estoque de \"" + p2.getNome() + "\":");
        System.out.println(p2.getQuantEstoque());
    }
}
