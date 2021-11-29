package lista6.atividade1;

public class Aluno extends Pessoa {
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;

    public Aluno(String nome, String dataNasc, double nota1, double nota2, double nota3) {
        super(nome, dataNasc);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getNota1() {
        return this.nota1;
    }
    public double getNota2() {
        return this.nota2;
    }
    public double getNota3() {
        return this.nota3;
    }
    public double getMedia() {
        this.media = (nota1 + nota2 + nota3) / 3;
        return this.media;
    }
}
