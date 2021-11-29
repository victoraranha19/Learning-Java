package lista4.atividade4;

public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;

        if (precoVenda<precoCusto) {
            System.out.println("O preco da venda eh menor que o preco do custo!!");
            this.precoVenda = precoCusto;
        }
    }

    public String getNome() {
        return nome;
    }
    public double getPrecoCusto() {
        return precoCusto;
    }
    public double getPrecoVenda() {
        return precoVenda;
    }
    public double calcularMargemLucro() {
        return precoVenda - precoCusto;
    }
    public double getMargemLucroPorcentagem() {
        return (precoVenda - precoCusto)/precoCusto;
    }
}
