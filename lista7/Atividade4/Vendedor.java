package lista7.atividade4;

public class Vendedor extends Empregado{
    private int cotaPecas;

    public Vendedor(String nome, int idade, int tel, int cotaPecas) {
        super(nome, idade, tel);
        salario = 1192.40;
        this.cotaPecas = cotaPecas;
    }

    public void venderPeca() {
        cotaPecas -= 1;
    }

    public int getCotaPecas() {
        return cotaPecas;
    }
}
