package POO.Exercicios;

public class Gerente extends Funcionario{
    /*Classe Gerente -> Funcionario:
    Atributos: bonus;
    Construtores: Cria Gerente com base no bônus e nos parâmetros do construtor de Funcionario.
    Métodos:
        - @Override getSalario() => calcula o salário com base no bônus*/

    private double bonus;

    public Gerente(String nome, double salario, int idade, double bonus) {
        super(nome, salario, idade);
        this.bonus = bonus;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + this.bonus;
    }
}
