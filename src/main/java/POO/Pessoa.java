package POO;

import java.util.ArrayList;

public class Pessoa {
    //Propriedades/Atributos
    private String nome;
    private String sobrenome;
    public int idade;
    public double altura;
    public double peso;

    ArrayList<Pessoa> conhecidos = new ArrayList<>();

    Pessoa(){ //construtor da classe
        //this -> representa o objeto
        this.nome = "Manoelly";
        this.sobrenome = "Bernado";
        this.idade = 24;
        this.peso = 55.50;
        this.altura = 1.63;
    }

    Pessoa(String nome, String sobrenome, int idade, double peso, double altura){
        /*this.nome = nome;
        this.sobrenome = sobrenome;*/
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.altura = 0.55;
        this.peso = 2.500;
    }

    //Ações de uma Pessoa (métodos)
    //Sintaxe: <tipo do retorno> nomeDoMetodo (parâmetros){}
    void dizOla(){
        System.out.println("Olá, tudo bem ? Meu nome é " + this.nome);
    }

    void mostrarIMC(){
        double IMC = this.peso / (this.altura * this.altura);
        System.out.println("O meu IMC é " + IMC);
    }

    double calcularIMC(){
        double IMC = this.peso / (this.altura * this.altura);
        return IMC;
    }

    void comer(String comida){
        System.out.println("Estou comendo " + comida);
        this.peso += 1.5;
    }

    void cumprimentar(Pessoa pessoa){
        this.dizOla();
        pessoa.dizOla();

        if (!this.conhecePessoa(pessoa)){
            this.addPessoaNova(pessoa);
            pessoa.addPessoaNova(this);
        }
    }

    private void addPessoaNova (Pessoa pessoa){ //faz o objeto "conhecer" a pessoa nova
        System.out.println(this.nome + " conheceu " + pessoa.nome + "!!!");
        this.conhecidos.add(pessoa);
    }

    boolean conhecePessoa(Pessoa pessoa){
        //se true, a pessoa (this) conhece outra pessoa
        //se false, não conhece
        return this.conhecidos.contains(pessoa);
    }

}
