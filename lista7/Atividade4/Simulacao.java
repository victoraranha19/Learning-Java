package lista7.atividade4;

public class Simulacao {
    public static void main(String[] args) {
        Cliente c = new Cliente("Arturito", 34, 977779999);
        Vendedor v = new Vendedor("Julia", 22, 988889999, 40);
        Gerente g = new Gerente("Rogerio", 58, 966669999, 2);

        System.out.println("\nCliente: " + c.nome);
        System.out.println("Idade: " + c.idade);
        System.out.println("Telefone: " + c.telefone);

        System.out.println("\nVendedor: " + v.nome);
        System.out.println("Idade: " + v.idade);
        System.out.println("Telefone: " + v.telefone);
        System.out.println("Cota de Pecas: " + v.getCotaPecas());
        System.out.printf("Salario: R$ %.2f\n", v.salario);

        System.out.println("\nGerente: " + g.nome);
        System.out.println("Idade: " + g.idade);
        System.out.println("Telefone: " + g.telefone);
        System.out.println("Setor: " + g.getSetor());
        System.out.printf("Salario: R$ %.2f\n", g.salario);


        System.out.println("\n...Simulando compras...\n");
        c.comprarPeca(20.99);
        v.venderPeca();
        c.comprarPeca(39.99);
        v.venderPeca();

        System.out.println("Vendedor: " + v.nome);
        System.out.println("Nova Cota de Pecas: " + v.getCotaPecas());

        System.out.println("Cliente: " + c.nome);
        System.out.printf("Divida com a loja: R$ %.2f", c.getDivida());
    }
}
