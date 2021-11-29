package lista2.atividade4;

public class TresNumeros {
    private float num1;
    private float num2;
    private float num3;

    private float menor;
    private float maior;
    private float medio;

    public void setNumero1(float num) {
        num1 = num;
    }
    public void setNumero2(float num) {
        num2 = num;
    }
    public void setNumero3(float num) {
        num3 = num;
    }

    public float getMenor() {
        setMenor(num1, num2, num3);
        return menor;
    }
    public float getMaior() {
        setMaior(num1, num2, num3);
        return maior;
    }
    public float getMedio() {
        setMedio(num1, num2, num3, maior, menor);
        return medio;
    }

    private void setMenor(float num1, float num2, float num3) {
        menor = num1 <= num2 ? num1 : num2;
        menor = menor <= num3 ? menor : num3;
    }
    private void setMaior(float num1, float num2, float num3) {
        maior = num1 >= num2 ? num1 : num2;
        maior = maior >= num3 ? maior : num3;
    }
    private void setMedio(float num1, float num2, float num3, float maior, float menor) {
        if (maior == menor)                       // menor == medio == maior
            medio = num2;
        else                                      // menor == medio xor medio == maior
            if (num1 == num2 || num1 == num3)
                medio = num1;
            else if (num2 == num3)
                medio = num2;
            else                                  // menor != medio != maior
                medio = menor < num1 && num1 < maior ? num1 : num2;
                medio = menor < num3 && num3 < maior ? num3 : medio;
    }
}
