package POO.Exercicios;

public class Empregado {

    /*Crie uma classe Empregado que possui:
            * Atributos: nome, sobrenome, salario
	* Construtores:
            - Cria empregados com base nos parâmetros nome, sobrenome e salario;
	* Métodos:
        - calcularSalarioAnual() => deve retornar double
		- aumentarSalario(double aumento) => aumenta o valor do salário
		- nomeCompleto() => deve retornar a concatenação do nome e sobrenome*/

    private String nome;
    private String sobrenome;
    private double salario;

    Empregado(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public double calcularSalarioAnual(){
        return salario * 12;
    }

    public void aumentarSalario(double aumento){
        salario += aumento;
    }

    public String nomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }

}

