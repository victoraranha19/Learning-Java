package classesAbstratas_e_interface;

public class Hospital {
    static void plantaoCirurgico(Cirurgiao x){x.operar();}
    static void atendimentoGeral(Medico x){x.consultar();}
    static void neuroAtendimento(Neurologista x){x.consultar();}
    static void neuroCirurgia(NeuroCirurgiao x){x.operar();}

    public static void main(String[] args) {
        Medico doutor = new NeuroCirurgiao();
        plantaoCirurgico((Cirurgiao) doutor);
        atendimentoGeral(doutor);
        neuroAtendimento((Neurologista) doutor);
        neuroCirurgia((NeuroCirurgiao) doutor);
    }
}
