package ExercicioObjPar;

public class Calcular {
    private Integer numero;

    public Calcular(Integer numero) {
        this.numero = numero;
    }

    public boolean CalcularPar (){
        return numero % 2 == 0;
    }

}
