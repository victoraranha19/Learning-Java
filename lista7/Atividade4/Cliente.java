package lista7.Atividade4;

public class Cliente extends Pessoa {
    private double divida;

    public Cliente(String nome, int idade, int tel) {
        super(nome, idade, tel);
        divida = 0;
    }

    public double getDivida() {
        return divida;
    }

    public void comprarPeca(double preco) {
        divida += preco;
    }
}
