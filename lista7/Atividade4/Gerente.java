package lista7.Atividade4;

public class Gerente extends Empregado {
    private int setor;

    public Gerente(String nome, int idade, int tel, int setor) {
        super(nome, idade, tel);
        salario = 2 * 1192.40;
        this.setor = setor;
    }

    public int getSetor() {
        return setor;
    }
}
