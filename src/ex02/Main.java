package ex02;

public class Main 
{
    public static void main(String[] args) 
    {
        Calculadora calculadora = new Calculadora(999.9 , 0.0);

        System.out.println(calculadora.dividir());
        System.out.println(calculadora.somar());
        System.out.println(calculadora.subtrair());
        System.out.println(calculadora.multiplicar());

        calculadora.setValor1(20.0);
        calculadora.setValor2(10.0);

        System.out.println(calculadora);
        System.out.println("Valor 1 = " + calculadora.getValor1());
        System.out.println("Valor 2 = " + calculadora.getValor2());
    }
}
