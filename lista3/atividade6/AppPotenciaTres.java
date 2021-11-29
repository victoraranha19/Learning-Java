package lista3.atividade6;

public class AppPotenciaTres {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            
            int pot = 1;
            for (int j = 0; j < i; j++)
                pot *= 3;
            
            System.out.println(pot);
        }
    }
}
