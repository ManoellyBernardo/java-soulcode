package aulas;

import java.util.Scanner;

public class EstudoArrays {

    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5};
        System.out.println(numeros.length); //tamanho do array

        System.out.println(numeros[3]); //4

        numeros[3] = 100;

        System.out.println(numeros[3]); //100

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Na posição " + i + " temos o valor: " + numeros[i]);
        }

        int[] numeros2 = new int[50];

        double[] notas = new double[5];

        String[] nomes = new String[10];
        String[] nomes2 = {"Manoelly", "Maria"};

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int quantidade = entrada.nextInt();
        boolean[] valores = new boolean[quantidade];

        //Exemplo

        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt();

        double[] notasProva = new double[totalNotas];

        for (int i = 0; i < totalNotas; i++){
            System.out.println("Digite o valor das notas: ");
            notasProva[i] = entrada.nextDouble();
        }

        double soma = 0;
        for ( double nota: notasProva) {
            soma += nota;
        }

        double media = soma/totalNotas;

        //Condição ternaria
        String mensagem = (media >= 7) ? "Você está aprovado": "Você está reprovado";
        System.out.println(mensagem);

        //Default values

        int numero; //Padrão = 0
        double nota2; //Padrão = 0.0
        long populacao; //Padrão = 0
        boolean teste; //Padrão = false

        //Classe String

        String nome; //null -> audência de objeto na variável

        //Wrapper Classes

        Integer numero2 = 1;
        Double nota3 = 1.0;
        Long populacao2 = 1L;
        Boolean teste2 = true;

        entrada.close();

    }
}
