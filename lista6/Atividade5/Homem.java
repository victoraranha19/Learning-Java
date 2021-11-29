package lista6.atividade5;

public class Homem extends PessoaIMC {
    public Homem(String nome, String dataNasc, double peso, double altura) {
        super(nome, dataNasc, peso, altura);
    }
    public String resultIMC() {
        double imc = super.calculaIMC(super.getAltura(), super.getPeso());
        if (imc<20.7)
            System.out.println("Abaixo do peso ideal");
        else if (imc<26.4)
            System.out.println("Peso ideal");
        else
            System.out.println("Acima do peso ideal");
        return "";
    }
}
