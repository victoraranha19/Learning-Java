package lista6.atividade5;

public class Pessoa {
    protected String nome;
    protected String dataNascimento;

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String toString() {
        return "\nNome: " + nome + "\nData de Nascimento: " + dataNascimento;
    }
}