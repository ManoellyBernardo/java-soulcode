package POO;

public class Calculadora {

    public static final double PI = 3.1415;

    public static double somar(double a, double b){
        return a + b;
    }

    public static double subtrair(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        return a / b;
    }

    public static void main(String[] args) {

        double resultadoSoma = Calculadora.somar(2,2);
        double resultadoSub = Calculadora.subtrair(5,2);
        double resultadoMul = Calculadora.multiplicar(2,2);
        double resultadoDiv = Calculadora.dividir(2,2);
        System.out.println(Calculadora.PI);
    }
}
