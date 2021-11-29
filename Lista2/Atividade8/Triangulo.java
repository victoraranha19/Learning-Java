package lista2.atividade8;

public class Triangulo {
    private float lado1;
    private float lado2;
    private float lado3;
    private String tipo;

    public void setLados(float l1, float l2, float l3) {
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
    }

    public String getTipo() {
        setTipo(lado1, lado2, lado3);
        return tipo;
    }

    private void setTipo(float lado1, float lado2, float lado3) {
        if (lado1 == lado2 && lado2 == lado3)
            tipo = "Equilatero";
        else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
            tipo = "Isoceles";
        else // lado1 != lado2 && lado2 != lado 3 && lado1 != lado3
            tipo = "Escaleno";
    }
}
