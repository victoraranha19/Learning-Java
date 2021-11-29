package lista6.Atividade3;

public class Imovel {
    protected String endereco;
    protected double preco;

    public Imovel(String end, double preco) {
        this.endereco = end;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }
    public double getPreco() {
        return preco;
    }
}
