package POO;

public class Carro {

    private int ano;
    private String marca;
    private String modelo;
    private boolean flex;
    private int qtdPortas;
    public double combustivel;
    private double consumo;
    public boolean ligado;

    Carro(String modelo, String marca, int ano, boolean flex, int qtdPortas, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.flex = flex;
        this.qtdPortas = qtdPortas;
        this.combustivel = 30.0;
        this.consumo = consumo;
        this.ligado = false;
    }

    // Abastecer
    void abastecer(double total) {
        this.combustivel += total;
    }

    // Ligar
    void ligar() {
        this.ligado = true;
    }

    // Desligar
    void desligar() {
        this.ligado = false;
    }

    // Viajar
    boolean viajar(String local, double distancia) /**tentar viajar, se der certo, retorna true, senão, false*/
    {
        if (!this.ligado) {
            this.ligar();
        }

        //Calcula quantos litros serão necessarios para viajar
        double totalLitros = distancia / this.consumo;

        if (this.combustivel - totalLitros > 0) {
            this.combustivel -= totalLitros;
            System.out.println("A viagem para " + local + " aconteceu. Sobrou " + this.combustivel + " L");
            return true; //viagem aconteceu
        } else {
            System.out.println("A viagem não aconteceu, faltou gasolina");
            return false; //viagem não aconteceu
        }
    }

    public static void main(String[] args) {

        Carro carro1 = new Carro("XY", "Ferrari", 2019, true, 4, 40);
        Carro carro2 = new Carro("Z", "Ford", 2000, false, 2, 50);
    }
}
