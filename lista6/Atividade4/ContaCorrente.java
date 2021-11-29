package lista6.atividade4;

public class ContaCorrente extends Conta {
    public void atualizar(double taxa) {
        double percentual = 2*taxa;
        super.atualizar(percentual);
    }

    public void depositar(double deposito) {
        deposito -= 0.10;
        super.depositar(deposito);
    }
}
