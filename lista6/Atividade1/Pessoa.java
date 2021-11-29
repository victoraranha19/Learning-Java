package lista6.atividade1;

public class Pessoa {
    protected String nome;
    protected String dataNasc;

    public Pessoa() {
        this.nome = "";
        this.dataNasc = "31/12/2001";
    }

    public Pessoa(String nome, String dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }
    public String getDataNasc() {
        return dataNasc;
    }
}