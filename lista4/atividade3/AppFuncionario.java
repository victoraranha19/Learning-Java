package lista4.atividade3;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario f1= new Funcionario("Claudio", 'M', "a", 7500.20);

        System.out.println("Salario inicial:");
        System.out.printf("%.2f\n", f1.getSalario());

        System.out.println("Salario anual:");
        System.out.printf("%.2f\n", f1.calcularAnual());

        f1.bonificar(20);
        System.out.println("\nSalario bonificado:");
        System.out.printf("%.2f\n", f1.getSalario());

        System.out.println("Salario anual:");
        System.out.printf("%.2f\n", f1.calcularAnual());
    }
}
