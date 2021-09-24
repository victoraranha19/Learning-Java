package Lista2.Atividade9;

public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;
    private int tempoTot;

    public void setHora(int novaHora) {
        horas = novaHora;
    }
    public void setMinuto(int novoMinuto) {
        minutos = novoMinuto;
    }
    public void setSegundo(int novoSegundo) {
        segundos = novoSegundo;
    }
    private void setTempoTot(int h, int m, int s) {
        tempoTot = h*3600 + m*60 + s;
    }

    public int getHora() {
        return horas;
    }
    public int getMinuto() {
        return minutos;
    }
    public int getSegundo() {
        return segundos;
    }
    public int getTempoTot() {
        setTempoTot(horas, minutos, segundos);
        return tempoTot;
    }
}
