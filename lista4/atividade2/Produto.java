package lista4.atividade2;

public class Produto {
    private int codigo;
    private String nome;
    private int quantEstoque;
    private double precoUnid;

    public Produto(int codigo, String nome, int quantEstoque, double precoUnid) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantEstoque = quantEstoque;
        this.precoUnid = precoUnid;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrecoUnid(double precoUnid) {
        this.precoUnid = precoUnid;
    }
    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
    public void venderProduto(int quantVendida) {
        quantEstoque -= quantVendida;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public double getPrecoUnid() {
        return precoUnid;
    }
    public int getQuantEstoque() {
        return quantEstoque;
    }
}
