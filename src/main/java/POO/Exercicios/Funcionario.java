package POO.Exercicios;

public class Funcionario {
    /*Crie uma hierarquia de classes:
Classe Funcionario:
    Atributos: nome, salario, idade;
    Construtores: Cria funcionários com base no nome, salario, idade;
    Métodos:
        - getSalario();
        - getSalarioAnual();
        - aumentarSalario(double acrescimo);
        - reduzirSalario(double reducao);*/

    private String nome;
    private double salario;
    private int idade;

    public Funcionario(String nome, double salario, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public double getSalario() {
        return this.salario;
    }

    public void getSalarioAnual(){
        System.out.println("O sálario anual é: " + this.salario * 12);
    }

    public void aumentarSalario(double acrescimo){
        System.out.println("O salário com acréscimo é de: " + (this.salario + acrescimo) );
    }

    public void reduzirSalario(double reducao){
        System.out.println("O salário com a redução fica: " + (this.salario + reducao) );
    }
}
