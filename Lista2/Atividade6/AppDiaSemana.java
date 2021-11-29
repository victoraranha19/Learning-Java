package lista2.atividade6;

import java.util.Scanner;

public class AppDiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um dia da semana, como numero:");
        int diaSemana = sc.nextInt();
        sc.close();

        String dia = "";
        switch (diaSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terca";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
            default:
                dia = "[error]";
                break;
        }

        System.out.println(diaSemana + " corresponde a " + dia);
    }
}
