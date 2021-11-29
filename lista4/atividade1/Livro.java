package lista4.atividade1;

public class Livro {
    private int codigo;
    private String nome;
    private int quantExemplares;

    public Livro(int codigo, String nome, int quantExemplares) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantExemplares = quantExemplares;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQuantExemplares(int quantExemplares) {
        this.quantExemplares = quantExemplares;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public int getQuantExemplares() {
        return quantExemplares;
    }
}