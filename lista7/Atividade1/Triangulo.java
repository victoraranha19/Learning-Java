package lista7.atividade1;

public class Triangulo extends Figura {
    private double a;
    private double b;
    private double c;

    public Triangulo() {
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }

    @Override
    public double calcularArea() {
        double altura;
        double area;

        if (a == b && b == c) {
            altura =  a * Math.sqrt(3)/2;
            area = a * altura / 2;
        }
        else if (a==b || a==c || b==c) {
            if (a==b) {
                altura = Math.sqrt((a*a - c*c) / 4);
                area = c * altura / 2;
            }
            else if (a==c) {
                altura = Math.sqrt((a*a - b*b) / 4);
                area = b * altura / 2;
            }
            else {
                altura = Math.sqrt((b*b - a*a) / 4);
                area = a * altura / 2;
            }
        }
        else {area = Math.sqrt((a+b+c) * (b+c) * (a+c) * (a+b));}

        return area;
    }
}
