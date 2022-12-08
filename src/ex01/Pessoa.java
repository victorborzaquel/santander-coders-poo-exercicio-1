package ExercicioObjPessoa;

public class Pessoa {
    private final String nomePessoa;
    private final int idade;
    private final double altura;

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
