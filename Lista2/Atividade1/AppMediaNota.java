package Lista2.Atividade1;

import java.util.Scanner;

public class AppMediaNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Digite as 3 notas do aluno:");
        a.setNota1(sc.nextDouble());
        a.setNota2(sc.nextDouble());
        a.setNota3(sc.nextDouble());

        double media = a.calcularMedia();

        if (media < 3.0)
            System.out.println("Reprovado");
        else
            if (media < 7.0)
                System.out.println("Prova Final");
            else
                System.out.println("Aprovado");
    }

}
