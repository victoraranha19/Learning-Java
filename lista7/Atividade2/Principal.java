package lista7.atividade2;

public class Principal {
    public static void main(String[] args) {
        ControleRemoto ctrl = new ControleRemoto();

        System.out.println("Volume inicial - " + ctrl.volume);
        System.out.println("Canal inicial - " + ctrl.canal);
        System.out.println("----------------------");

        ctrl.aumentarVolume();
        ctrl.aumentarVolume();
        ctrl.aumentarVolume();
        ctrl.passarCanal();
        ctrl.passarCanal();

        System.out.println("Volume - " + ctrl.volume);
        System.out.println("Canal - " + ctrl.canal);
        System.out.println("----------------------");

        ctrl.diminuirVolume();
        ctrl.diminuirVolume();
        ctrl.aumentarVolume();
        ctrl.voltarCanal();

        System.out.println("Volume - " + ctrl.volume);
        System.out.println("Canal - " + ctrl.canal);
        System.out.println("----------------------");

        ctrl.aumentarVolume();
        ctrl.aumentarVolume();
        ctrl.aumentarVolume();
        ctrl.selecionarCanal(20);

        System.out.println("Volume - " + ctrl.volume);
        System.out.println("Canal - " + ctrl.canal);
    }
}
