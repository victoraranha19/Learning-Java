package lista4.atividade3;

public class Funcionario {
    private String nome;
    private char genero;
    private String departamento;
    private double salario;

    public Funcionario(String nome, char genero, String departamento, double salario) {
        this.nome = nome;
        this.genero = genero;
        this.departamento = departamento;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void bonificar(double bonificacao) {
        salario *= (1 + (bonificacao/100));
    }

    public String getNome() {
        return nome;
    }
    public char getGenero() {
        return genero;
    }
    public String getDepartamento() {
        return departamento;
    }
    public double getSalario() {
        return salario;
    }
    public double calcularAnual() {
        return salario*13;
    }
}