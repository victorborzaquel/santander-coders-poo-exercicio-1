package ExercicioObjPessoa;

public class Pessoa {
    private String nomePessoa;
    private int idade;
    private double altura;

    public Pessoa(String nomePessoa, int idade, double altura) {
        this.nomePessoa = nomePessoa;
        this.idade = idade;
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome:'" + nomePessoa + '\'' +
                ", idade:'" + idade + '\'' +
                ", altura:'" + altura + '\'' +
                '}';
    }
}
