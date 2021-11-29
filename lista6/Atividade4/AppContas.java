package lista6.Atividade4;

public class AppContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.depositar(1000.00);
        cp.depositar(1000.00);

        cc.atualizar(0.52);
        cp.atualizar(0.52);

        cc.sacar(200);
        cp.sacar(200);

        System.out.println("\nConta Corrente:");
        System.out.printf("R$ %.2f", cc.verificarSaldo());
        System.out.println("\nConta Poupanca: ");
        System.out.printf("R$ %.2f", cp.verificarSaldo());
    }
}
