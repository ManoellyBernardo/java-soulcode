package POO.Exercicios;

import POO.Pet;

public class Cachorro extends Pet {

    private String comidaFavorita;
    private String raca;

    public Cachorro(String comidaFavorita, String raca, String nome, int idade, double peso) {
        //super representa a classe Mãe (Pet, neste caso)
        super(nome, idade, peso); //Chamando o construtor da classe Mãe/Super classe
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;

    }
    @Override
    public void fazerSom(){//sobrecresveu o método
        System.out.println("Au au");
    }

    @Override
    public void brincar(){ //o cachorro late na hora de brincar
        this.fazerSom(); //chama o fazerSom() do cachorro que foi sobrescrito
        super.brincar(); //chamou o método brincar() da classe mãe
        this.dormir(); // chama o dormir do Pet, pois não foi sobrescrito
    }

    @Override
    public void comer(String comida){
        if (comida.equals(this.comidaFavorita)){
            super.comer(comida);
            //this.setPeso(this.getPeso() + .2); --> aqui se o atributo fosse private
            this.peso += .2; //-> aqui o atributo peso esta protected
        } else {
            System.out.println("Quero minha comida favorita!");
        }
    }

    public void correrAtrasMoto(){
        this.fazerSom();
        System.out.println("Correndo atrás da moto..");
    }

    public static void main(String[] args) {
        //Testar a herança

        Pet pet1 = new Pet("Fred", 3, 12.5);

        pet1.dormir();
        pet1.comer("Batata");
        pet1.fazerSom();

        System.out.println("\n-----------------------\n");

        Cachorro batata = new Cachorro("Osso", "Caramelo", "Rex", 5, 25);
        batata.dormir();
        batata.fazerSom();
        batata.comer("Feijão");
        batata.setPeso(20);
        System.out.println(pet1.getPeso());
        batata.brincar();
        batata.correrAtrasMoto();

    }
}
