package lista6.Atividade5;

public class PessoaIMC extends Pessoa {
    private double peso;
    private double altura;

    public PessoaIMC(String nome, String dataNasc, double peso, double altura) {
        super(nome, dataNasc);
        this.peso = peso;
        this.altura = altura;
    }

    public double calculaIMC(double altura, double peso) {
        return peso / (Math.pow(altura, 2));
    }
    public String resultIMC() {
        return "" + calculaIMC(altura, peso);
    }
    public String toString() {
        return super.toString() + "\nPeso: " + peso + "\nAltura: " + altura;
    }

    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }
}
