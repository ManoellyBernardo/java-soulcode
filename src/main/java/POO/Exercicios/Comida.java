package POO.Exercicios;

public class Comida {

    /*Crie uma classe Comida:
    * Atributos: nome, peso;
	* Construtores: Cria a comida com base nos parâmetros nome e peso;
	* Métodos:
        - getNome()
		- getPeso()*/

    private String nome;
    private double peso;

    public Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }
}
