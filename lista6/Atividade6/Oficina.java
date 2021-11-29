package lista6.atividade6;

public class Oficina {
    public Veiculo proximo() {
        Veiculo v = new Veiculo();
        return v;
    }
    public void manutencao(Veiculo v) {
        v.listarVerificacoes();
        v.ajustar();
        v.limpar();
        if (v instanceof Automovel) {
            ((Automovel) v).mudarOleo();
        }
    }
}
