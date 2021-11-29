package lista7.atividade1;

public class Circulo extends Figura {
    private double raio;

    public Circulo() {
        raio = 1;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
