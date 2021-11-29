package lista7.Atividade5;

public class Animal {
    protected double massa;
    protected String tamanho;

    public void movimentar() {}
    public void comunicar() {}

    public static void main(String[] args) {
        Homem h = new Homem(90.98, "Grande");
        Peixe px = new Peixe(0.54, "Pequeno");
        Passaro pss = new Passaro(5.5, "Medio");

        Animal []animalArray = {h, px, pss};

        for (int i=0; i<animalArray.length; i++) {
            animalArray[i].movimentar();
            animalArray[i].comunicar();
            System.out.printf("Massa = %.2f KG\n", animalArray[i].massa);
            System.out.println("Tamanho = " + animalArray[i].tamanho + "\n");
        }
    }
}
