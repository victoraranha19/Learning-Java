package lista6.Atividade5;

public class Mulher extends PessoaIMC {
    public Mulher(String nome, String dataNasc, double peso, double altura) {
        super(nome, dataNasc, peso, altura);
    }
    public String resultIMC() {
        double imc = super.calculaIMC(super.getAltura(), super.getPeso());
        String result;
        if (imc<19)
            result = "Abaixo do peso ideal";
        else if (imc<25.8)
            result = "Peso ideal";
        else
            result = "Acima do peso ideal";
        return result;
    }
}
