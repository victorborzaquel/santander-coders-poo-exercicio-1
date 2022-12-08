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

    public Double getValor1()
    {
        return valor1;
    }

    public void setValor1(Double valor1)
    {
        this.valor1 = valor1;
    }

    public Double getValor2()
    {
        return valor2;
    }

    public void setValor2(Double valor2)
    {
        this.valor2 = valor2;
    }

    @Override
    public String toString()
    {
        return "-----Calculadora-----" + "\n" +
                "Valor 1: " + valor1 + "\n" +
                "Valor 2: " + valor2 + "\n" +
                "Soma: " + somar() + "\n" +
                "Subtração: " + subtrair() + "\n" +
                "Multiplicação: " + multiplicar() + "\n" +
                "Divisão: " + dividir() + "\n" +
                "----------------------";
    }
}
