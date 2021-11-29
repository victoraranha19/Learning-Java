package lista6.Atividade1;

public class App {
    public static void main(String[] args) {
        Aluno a = new Aluno("Victor", "16/10/2002", 6.6, 7, 4.33);

        System.out.println("Aluno: " + a.getNome());
        System.out.println("\nData de Nascimento: " + a.getDataNasc());
        System.out.println("Média das notas: " + a.getMedia());
    }
}
