package POO.Escola;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Maria José", "mariajose@email.com", "123456789", 7.9);

        Professor prof = new Professor("Fernando", "fernado@email.com", "987654321", "TI");

        prof.apresentar();

        Pessoa p1 = new Pessoa("Luiz Ricardo", "luizricardo@email.com", "963852741");

        p1.apresentar();

        //Aluno é uma Pessoa
        Pessoa p2 = new Aluno("Maria Joaquina","mariajoaquina@email.com", "741852963", 9.5);

        //Professor também é uma Pessoa
        Pessoa p3 = new Professor("João", "joao@email.com", "852963741", "Matematica");

        System.out.println("============");
        p2.apresentar();
        p3.apresentar();

        ArrayList <Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(prof);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        for (Pessoa pessoa: pessoas) {
            //o metodo apresentar() se comporta diferentemente depedendo do classe
            //original
            pessoa.apresentar();
        }

    }
}
