package aulas;

public class Variaveis {
    //Execução do programa Java
    public static void main(String[] args) {

        System.out.println("Hello, word!");

        //aulasVariaveis
        //Java é fortemente tipado e estaticamente tipado

        int idade = 20; //int -> inteiro
        double salario = 1210.00; //double -> real
        float notaPessoa = 7.5f; //Sufixo para float
        long populacaoTerra = 7_900_000_000L;
        boolean tarefaConcluida = true; //true ou false
        int i = 1, j = 0, k = 100;
        String nome = "Manoelly";

        int teste = 10;
        teste = 9; //reatribuição de variaveis

        final int teste2 = 200; //impossivel mudar o valor -> equivale ao const do JS

        //Operadores

        int a = 10;
        int b = 5;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;

        System.out.println("O resultado da soma é " + soma);

        int sete = 7;
        int dois = 2;

        System.out.println(sete/dois);

        //Math

        double x = Math.sqrt(144);
        double y = Math.pow(5,2);
        double pi = Math.PI;

        int pi2 = (int) Math.PI;
        System.out.println(pi2);

        double resultado = sete / (double) dois;
        System.out.println(resultado);

        //Operadores 2

        int valor = 5;
        valor++;
        valor--;
        valor += 10;
        valor -= 10;

        //Operdadores relacionais

        boolean teste1 = 5 > 1; //true
        boolean teste3 = 5 < 1; //false
        boolean teste4 = 5 == 5; //true
        boolean teste5 = 5 != 1; //true
        boolean teste6 = 6 >= 6; //true
        boolean teste7 = 5 <= 9; //true

        //Operadores logicos

        boolean teste8 = true && false; //false
        boolean teste9 = true || false; //true
        boolean teste10 = (5>10) && (10<5); //false
        boolean teste11 = (10 >= 0) || (1 < 5); //true
        boolean teste12 = !teste11; //false

    }
}
