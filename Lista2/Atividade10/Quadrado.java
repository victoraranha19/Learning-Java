package Lista2.Atividade10;

public class Quadrado {
    private double lado;
    private double area;
    private double perimetro;

    public void setLado(double novoLado) {
        lado = novoLado;
    }
    private void calcularArea(double lado) {
        area = lado*lado;
    }
    private void calcularPerimetro(double lado) {
        perimetro = lado*4;
    }

    public double getLado() {
        return lado;
    }
    public double getArea() {
        calcularArea(lado);
        return area;
    }
    public double getPerimetro() {
        calcularPerimetro(lado);
        return perimetro;
    }
}
