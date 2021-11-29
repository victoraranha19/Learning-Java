package lista6.Atividade2;

public class App2 {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Object [] data = {"Lista5", new Object(), i};

        System.out.println("No array data\n");
        
        System.out.println("O primeiro elemento é do tipo: " + data[0].getClass().getSimpleName());
        System.out.println("O segundo elemento é do tipo: " + data[1].getClass().getSimpleName());
        System.out.println("O terceiro elemento é do tipo: " + data[2].getClass().getSimpleName());
    }
}
