package lista6.atividade6;

public class Principal {
    public static void main(String args[]) {
        Oficina o = new Oficina();
        Veiculo v;
        for(int i = 0; i < 5; ++i){
            v = o.proximo();
            o.manutencao(v);
        }
    }  
}
