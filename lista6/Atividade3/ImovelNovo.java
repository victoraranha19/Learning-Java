package lista6.atividade3;

public class ImovelNovo extends Imovel {
    public ImovelNovo(String end, double preco) {
        super(end, preco);
    }

    public double getPreco() {
        double preco = super.getPreco() * 1.1;
        return preco;
    }
}
