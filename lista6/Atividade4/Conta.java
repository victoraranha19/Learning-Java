package lista6.Atividade4;

public class Conta {
    protected double saldo;

    public Conta() {
        this.saldo = 0;
    }

    public double verificarSaldo() {
        return this.saldo;
    }
    public void depositar(double deposito) {
        this.saldo += deposito;
    }
    public void sacar(double saque) {
        this.saldo -= saque;
    }

    public void atualizar(double percentual) {
        this.saldo *= (1 + percentual/100);
    }
}
