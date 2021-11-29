package lista5.Atividade7;

public class AppPalindromo {
    public static void main(String[] args) {
        char [] caracteres = {'o', 'v', 'o'};

        if (verificarPalindromo(caracteres))
            System.out.println("eh palindromo");
        else
            System.out.println("nao eh palindromo");
    }

    public static boolean verificarPalindromo(char []c) {
        for (int i=0; i < (c.length/2); i++) {
            int j = (c.length - 1) - i;
            if (c[i] != c[j])
                return false;
        }
        return true;
    }
}
