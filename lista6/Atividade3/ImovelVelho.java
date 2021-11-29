package lista6.atividade3;

public class ImovelVelho extends Imovel {
    public ImovelVelho(String end, double preco) {
        super(end, preco);
    }

    public double getPreco() {
        double preco = super.getPreco() * 0.7;
        return preco;
    }
}
