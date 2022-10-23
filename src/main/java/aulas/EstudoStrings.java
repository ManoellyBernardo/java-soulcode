package aulas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EstudoStrings {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Strings são cadeias de caracteres
        //"Jose" -> J = 0, o = 1, s = 2, e = 3
        String nome = "Pedro";

        if (nome == "Pedro"){
            System.out.println("São iguais!");
        }

        System.out.println("Qual é seu sobrenome ? ");
        String sobrenome = entrada.next();

        if (sobrenome.equals("Pereira")){
            System.out.println("São iguais!");
        } else {
            System.out.println("São diferentes!");
        }

        //equalsIgnoreCase() -> ignora minusculo e maiusculo

        //Outros métodos Strings

        String java = "Java";
        String ja = java.substring(0,2); //começa do index 0 e vai até o 2 (não incluso)
        String va = java.substring(2); //corta do 2 até o final

        String n1 = "Hello";
        String n2 = " World";
        String n3 = n1 + n2;
        String n4 = n1.concat(n2);

        System.out.println(n3);

        System.out.println(n4.length()); //Retorna o tamanho do String
        System.out.println(java.isEmpty()); //Verifica se minha String tem caracteres e retorna um booleano
        System.out.println(java.toLowerCase()); //JAVA -> coloca a String toda em caixa ALTA
        System.out.println(java.toUpperCase());//java -> coloca a String toda em caixa baixa

        String data = "13/10/2022";
        String[] valores = data.split("/"); // ["13", "10", "2022"]
        System.out.println(valores[0]); //"13"

        String email = "manoelly@gmai.com";
        String[] valoresEmail = email.split("@"); //["manoelly", "email.com"]
        System.out.println(Arrays.toString(valoresEmail));

        String nome2 = "Manoelly Maria";
        String[] nomeCortado = nome2.split(" ");
        System.out.println(nomeCortado[0]);//["Manoelly"]

        String teste = "Amanhã é sexta-feira";
        String[] teste2 = teste.split("");
        System.out.println(Arrays.toString(teste2)); //[A, m, a, n, h, ã,  , é,  , s, e, x, t, a, -, f, e, i, r, a]

    }
}
