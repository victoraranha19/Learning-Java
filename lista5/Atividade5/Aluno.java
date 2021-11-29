package lista5.atividade5;

public class Aluno {
    private String nome = new String();
    private double media;
    private String situacao = new String();

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    private void setSituacao(double media) {
        if (media < 5)
            situacao = "Reprovado";
        else
            situacao = "Aprovado";
    }

    public String getNome() {
        return nome;
    }
    public double getMedia() {
        return media;
    }
    public String getSituacao() {
        setSituacao(media);
        return situacao;
    }
}
