package lista2.atividade5;

import java.util.Scanner;

public class AppNumeroMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome de um mês");
        System.out.println("(minusculo e sem caracteres especiais):");
        String mes = sc.next();
        int numMes;
        sc.close();

        switch (mes) {
            case "janeiro":
                numMes = 1;
                break;
            case "fevereiro":
                numMes = 2;
                break;
            case "marco":
                numMes = 3;
                break;
            case "abril":
                numMes = 4;
                break;
            case "maio":
                numMes = 5;
                break;
            case "junho":
                numMes = 6;
                break;
            case "julho":
                numMes = 7;
                break;
            case "agosto":
                numMes = 8;
                break;
            case "setembro":
                numMes = 9;
                break;
            case "outubro":
                numMes = 10;
                break;
            case "novembro":
                numMes = 11;
                break;
            case "dezembro":
                numMes = 12;
                break;
            default:
                numMes = 0;
                break;
        }

        System.out.println("Numero equivalente ao mes = " + numMes);
    }
}
