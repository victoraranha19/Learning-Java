package lista5.Atividade5;

import java.util.Scanner;

public class App5Alunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno [] aluno = new Aluno [5];

        String nomeMaiorMedia = new String();
        double maiorMedia=0;

        for (int i=0; i<5; i++) {
            aluno[i] = new Aluno();

            System.out.println("\nAluno " + (i+1));
            System.out.println("Nome:");
            aluno[i].setNome(sc.nextLine());

            System.out.println("Media:");
            aluno[i].setMedia(sc.nextDouble());
            clearBuffer(sc);

            double media = aluno[i].getMedia();

            if (i==0) {
                maiorMedia = media;
            }
            if (media >= maiorMedia) {
                maiorMedia = media;
                nomeMaiorMedia = aluno[i].getNome();
            }
        }
        sc.close();

        System.out.println("\nAluno com maior media:");
        System.out.println(nomeMaiorMedia);

        System.out.println("\nReprovados:");
        for (int i=0; i<5; i++) {
            if (aluno[i].getSituacao() == "Reprovado") {
                System.out.println(aluno[i].getNome());
            }
        }
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
