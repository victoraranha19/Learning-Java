package lista6.Atividade4;

public class ContaPoupanca extends Conta {
    public void atualizar(double taxa) {
        double percentual = 3*taxa;
        super.atualizar(percentual);
    }
}
