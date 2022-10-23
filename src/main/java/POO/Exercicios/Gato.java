package POO.Exercicios;

import POO.Pet;

public class Gato extends Pet {

    private String comidaFavorita;
    private String raca;

    public Gato(String nome, int idade, double peso, String comidaFavorita, String raca) {
        super(nome, idade, peso);
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void brincar() {
        this.fazerSom();
        super.brincar();
    }

    @Override
    public void comer(String comida) {
        if (comida.equals(this.comidaFavorita)) {
            System.out.println("Huuum, amo " + this.comidaFavorita);
        } else{
            System.out.println("Quero minha comida favorita :(");
        }
    }

    public void seLamber(){
        System.out.println("O gato esta tomando banho..");
    }
}
