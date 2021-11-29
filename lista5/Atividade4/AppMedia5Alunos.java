package lista5.atividade4;

import java.util.Scanner;

public class AppMedia5Alunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] nome = new String [5];
        double [] media = new double [5];

        String nomeMaiorMedia = new String();
        double maiorMedia=0;

        String [] nomeReprovs = new String [5];
        int nReprovados=0;

        for (int i=0; i<5; i++) {
            System.out.println("\nAluno " + (i+1));
            System.out.println("Nome:");
            nome[i] = sc.nextLine();

            System.out.println("Media:");
            media[i] = sc.nextDouble();
            clearBuffer(sc);

            if (i==0)
                maiorMedia = media[i];
            
            if (media[i] >= maiorMedia) {
                maiorMedia = media[i];
                nomeMaiorMedia = nome[i];
            }

            if (media[i] < 5) {
                nomeReprovs[nReprovados] = nome[i];
                nReprovados++;
            }
        }

        System.out.println("Aluno com maior media:");
        System.out.println(nomeMaiorMedia);

        System.out.println("\nReprovados:");
        for (int i=0; i<nReprovados; i++)
            System.out.println(nomeReprovs[i]);
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
