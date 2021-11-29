package lista2.atividade1;

public class Aluno {
    private double nota1;
    private double nota2;
    private double nota3;

    public void setNota1(double novaNota) {
        nota1 = novaNota;
    }
    public void setNota2(double novaNota) {
        nota2 = novaNota;
    }
    public void setNota3(double novaNota) {
        nota3 = novaNota;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }
}
