package lista6.atividade5;

public class AppIMC {
    public static void main(String[] args) {
        Homem h1, h2, h3;
        Mulher m1, m2;
        h1 = new Homem("Juvenal", "20/10/1989", 79.8, 1.77);
        h2 = new Homem("Edvaldo", "1/1/2002", 71.7, 1.54);
        h3 = new Homem("Arnaldo", "7/10/2012", 23.1, 1.22);
        m1 = new Mulher("Clotilde", "12/12/2000", 44.9, 1.66);
        m2 = new Mulher("Irineide", "14/2/2005", 88.9, 1.5);

        PessoaIMC []p = {h1, m1, h2, m2, h3};

        for (int i=0; i<p.length; i++) {
            System.out.println(p[i].toString());
            System.out.println(p[i].resultIMC());
        }
    }
}
