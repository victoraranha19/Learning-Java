package lista3.atividade8;

public class AppAumentoSalario {
    public static void main(String[] args) {
        int anoInicio = 2005;
        double salario = 1000; //salario inicial

        double per = 1.5; //percentual inicial

        for (int i = anoInicio; i <= 2016; i++) {
            System.out.println("\n" + i);
            System.out.println("Salario = " + salario);

            salario *= per;
            per *= 2;
        }
    }
}
