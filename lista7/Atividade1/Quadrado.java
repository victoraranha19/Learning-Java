package lista7.Atividade1;

public class Quadrado extends Figura {
    private double lado;

    public Quadrado() {
        this.lado = 2;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
