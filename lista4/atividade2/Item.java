package lista4.atividade2;

public class Item {
    private int codigo;
    private Produto produto;
    private int quantVendida;

    public Item(int codigo, Produto produto, int quantVendida) {
        this.codigo = codigo;
        this.produto = produto;
        this.quantVendida = quantVendida;
        produto.venderProduto(quantVendida);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public void setQuantVendida(int quantVendida) {
        this.quantVendida = quantVendida;
        produto.venderProduto(quantVendida);
    }

    public int getCodigo() {
        return codigo;
    }
    public Produto getProduto() {
        return produto;
    }
    public int getQuantVendida() {
        return quantVendida;
    }
}
