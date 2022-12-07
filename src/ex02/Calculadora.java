package ex02;

public class Calculadora {
    private Double valor1;
    private Double valor2;

    public Calculadora(Double valor1, Double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public Double somar()
    {
        return valor1 + valor2;
    }
    public Double subtrair()
    {
        return valor1 - valor2;
    }
    public Double multiplicar()
    {
        return valor1 * valor2;
    }
    public Double dividir() {
        return valor1 / valor2;
    }
}
