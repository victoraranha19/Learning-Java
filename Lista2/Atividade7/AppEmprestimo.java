package Lista2.Atividade7;

import java.util.Scanner;

public class AppEmprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente fulano = new Cliente();

        System.out.println("Digite o valor do salario bruto:");
        float salarioBruto = sc.nextFloat();
        System.out.println("Digite o valor dos descontos (%):");
        float descontos = sc.nextFloat();
        System.out.println("Digite o valor do emprestimo solicitado:");
        float emprestimo = sc.nextFloat();

        fulano.setSalario(salarioBruto, descontos);

        if (emprestimo <= 0.3*fulano.getSalarioLiq())
            System.out.println("Emprestimo solicitado");
        else
            System.out.println("Invalido! O emprestimo nao pode ser maior que 30% do salario liquido.");
    }
}
