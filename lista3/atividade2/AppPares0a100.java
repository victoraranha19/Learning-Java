package lista3.atividade2;

public class AppPares0a100 {
    public static void main(String[] args) {
        System.out.println("Todos os pares de 0 a 100:");

        imprimirParesFor();
        //imprimirParesWhile();
        //imprimirParesDoWhile();
    }

    public static void imprimirParesFor() {
        for (int i = 0; i <= 100; i++)
            if (i%2 == 0)
                System.out.print(i + " ");
    }

    public static void imprimirParesWhile() {
        int n = 0;
        while (n<=100) {
            if (n%2 == 0)
                System.out.print(n + " ");
            n++;
        }
    }

    public static void imprimirParesDoWhile() {
        int n = 0;
        do {
            if (n%2 == 0)
                System.out.print(n + " ");
            n++;
        } while (n<=100);
    }
}
