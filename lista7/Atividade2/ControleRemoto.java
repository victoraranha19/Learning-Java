package lista7.atividade2;

public class ControleRemoto extends Televisao{
    public void aumentarVolume() {
        volume += 1;
    }
    public void diminuirVolume() {
        volume -= 1;
    }
    public void passarCanal() {
        canal += 1;
    }
    public void voltarCanal() {
        volume -= 1;
    }
    public void selecionarCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return this.volume;
    }
    public int getCanal() {
        return this.canal;
    }
}
