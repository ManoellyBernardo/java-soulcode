package POO.Exercicios;

public class Bicicleta extends Object {

    private int marcha;
    private double velocidade;

    public Bicicleta(int marcha, double velocidade){
        this.marcha = marcha;
        this.velocidade = velocidade;
    }

    @Override
    public String toString(){ //retornar a representação do objeto em String
        return "Bicicleta(marcha = " + this.marcha + "," + "velocidade = " + this.velocidade + ")";
    }

    public static void main(String[] args) {

        Bicicleta bicicleta = new Bicicleta(2,10);

        System.out.println(bicicleta.toString());
    }
}
