
package POO.Exercicios;

import java.util.ArrayList;

public class Bichinho {

    /*Crie uma classe Bichinho:
            * Atributos: nome, idade, peso, bucho (lista de Comida), estaDormindo(boolean)
            * Construtores: Cria bichinhos com base nos atributos nome, idade, peso. Bucho deve começar com lista vazia. estaDormindo deve iniciar false.
            * Métodos:
            - comer(Comida comida) => a comida deve alterar o peso do bichinho, o bichinho não come a mesma comida duas vezes. Ele não come se estiver dormindo!
            - dormir(int horas) => altera o boolean estaDormindo p/ true, para cada hora dormida o bichinho perde 10% de seu peso atual;
		- acordar() => altera o boolean estaDormindo p/ false*/


    private String nome;
    private int idade;
    private double peso;
    private ArrayList <Comida> bucho;
    private boolean estaDormindo;
    private double histamina;

    Bichinho(String nome, int idade){
        this.nome= nome;
        this.idade = idade;
        this.peso = 20;
        this.bucho = new ArrayList<>(); //buchin vazio <3
        this.estaDormindo = false; //acordado
        this.histamina = 3;
    }

    public void comer(Comida comida){
        if (!this.bucho.contains(comida) && !this.estaDormindo){
            System.out.println("Huuum, " + comida.getNome());
            bucho.add(comida);
            this.peso += comida.getPeso();
        } else if(this.estaDormindo) {
            System.out.println("ZzZzZzZz");
        } else if (this.bucho.contains(comida)) {
            System.out.println("Quero comida diferente!!");
        }
    }

    public void dormir(int horas){
        this.estaDormindo = true;
        double emagrecimento = horas * this.peso * .1;
        double perdaPeso = this.peso - emagrecimento;

        if (perdaPeso <= 5){
            this.histamina =- 1;
        }

        if (this.histamina <= 1){
            this.acordar();
            System.out.println("Estou com fome :(");
        }
    }

    public void acordar(){
        if (estaDormindo){
            System.out.println("Cutucar " + this.nome);
            estaDormindo = false;
        }
    }

    public static void main(String[] args) {
        Bichinho pou = new Bichinho("Pou", 5);
        Comida batata = new Comida("Batata", 15.0);
        Comida frango = new Comida("Frango", 20);
        pou.comer(batata);
        pou.dormir(8);
        pou.comer(frango);
        pou.acordar();
        pou.comer(frango);

    }
}