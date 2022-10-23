
package POO;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        /*pessoa1.nome = "Manoelly";
        pessoa1.sobrenome = "Bernardo";*/
        pessoa1.idade = 24;
        pessoa1.peso = 53.50;
        pessoa1.altura = 1.63;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();

        Pessoa pessoa3 = new Pessoa("Maria", "José", 29, 52.8, 1.62);

        Pessoa recemNascido = new Pessoa("Enzo", "Cellulari");

        pessoa1.comer("batata");

        Pessoa pedro = new Pessoa("Pedro", "Jose", 29, 1.10, 80);

        Pessoa joao = new Pessoa("Joao", "Carlos", 30, 1.75, 90);

        joao.cumprimentar(pedro);

    }
}
