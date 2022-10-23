package POO.Exercicios;

public class Circulo {
   /* 1) Crie uma classe Circulo que possui:
            * Atributos: raio, cor.
	* Construtores:
        - Cria circulos com base no parâmetro raio do construtor;
		- Cria círculos de raio 1;
	* Métodos:
        - calcularArea() => deve retornar double (PI * RAIO * RAIO)
		- calcularCircunferencia => deve retornar double (2 * PI * RAIO)
		- mudarRaio(double novoRaio) => deve alterar o valor do raio*/

	private double raio;
    private String cor;

    Circulo(double raio){
        this.raio = raio;
    }

    Circulo(){
        raio = 1;
    }

    public double calcularArea(double raio){
        double pi = 3.1415;
        return pi * raio * raio;
    }

    public double calcularCircunferencia(){
        double pi = 3.1415;
        return pi * 2 * raio;
    }

    public void mudarRaio(double novoRaio){
        novoRaio = raio;
    }
}


