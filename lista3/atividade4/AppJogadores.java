package lista3.atividade4;

import java.util.Scanner;

public class AppJogadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jogador j;
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        Jogador j3 = new Jogador();
        Jogador j4 = new Jogador();
        Jogador j5 = new Jogador();

        int menores18Idade = 0;
        float somaIdade = 0;
        int maiores80Kg = 0;

        for (int i = 1; i <= 5; i++) {
            if (i==1) j = j1;
            else if (i==2) j = j2;
            else if (i==3) j = j3;
            else if (i==4) j = j4;
            else j = j5;

            System.out.println("\nJOGADOR " + i);
            System.out.println("Nome: ");
            j.setNome(sc.next());
            System.out.println("Idade: ");
            j.setIdade(sc.nextInt());
            System.out.println("Peso: ");
            j.setPeso(sc.nextFloat());

            menores18Idade = j.getIdade() < 18 ? menores18Idade+1 : menores18Idade;
            somaIdade += j.getIdade();
            maiores80Kg = j.getPeso() > 80 ? maiores80Kg+1 : maiores80Kg;
        }
        sc.close();

        System.out.println("\nJogadores menores de 18 anos: " + menores18Idade);
        System.out.println("Media das idades: " + somaIdade/5);
        System.out.println("Jogadores com mais de 80Kg: " + 100*maiores80Kg/5 + "%");
    }
}
