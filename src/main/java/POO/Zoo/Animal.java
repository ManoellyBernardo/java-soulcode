package POO.Zoo;

//Na interface se define um conjunto de metodos
//E a classe que "herda" deve implementa-las
public interface Animal {

    void dormir();// definição de metodos, apenas

    void fazerSom();

    void comer(String comida);

}

class Gato implements Animal {

    @Override
    public void dormir() {
        System.out.println("ZzZzZzZz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void comer(String comida) {
        if (comida.equals("peixe")) {
            System.out.println("Amo peixe!");
        } else {
            System.out.println("Gostaria de peixe.. :(");
        }
    }

    public void ronronar() {
        System.out.println("ronronando..");
    }
}

class Galinha implements Animal {

    @Override
    public void dormir() {
        System.out.println("Có có ZzZzZzZz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Có có ricó");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Huuuum có có " + comida);
    }

    public static void main(String[] args) {

        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        gato.fazerSom();
        galinha.comer("milho");
        gato.comer("peixe");

        //Não consigo criar objetos na interface
        //Animal novoAnimal = new Animal();

        Animal animalGalinha = galinha;
        Animal animalGato = gato;

        System.out.println("---------POLIMORFISMO----------");
        animalGalinha.fazerSom();
        animalGato.fazerSom();

        galinha.fazerSom();
        ;
        gato.fazerSom();

    }
}
