package Lista2.Atividade7;

public class Cliente {
    private float salarioLiquido;

    public void setSalario(float salarioBruto, float descontos) {
        salarioLiquido = salarioBruto * (1 - descontos/100);
    }
    public float getSalarioLiq() {
        return salarioLiquido;
    }
}
