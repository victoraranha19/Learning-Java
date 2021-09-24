package Lista2.Atividade2;

public class Nadador {
    private int idade;
    private String categoria;

    public void setIdade(int novaIdade){
        idade = novaIdade;
    }

    public String getCategoria(){
        setCategoria(idade);
        return categoria;
    }

    private void setCategoria(int idade){
        if (idade <= 10)
            categoria = "Infantil";
        else if (idade <= 15)
            categoria = "Jovem";
        else if (idade <= 30)
            categoria = "Adolescente";
        else if (idade <= 45)
            categoria = "Adulto";
        else
            categoria = "Senior";
    }
}
