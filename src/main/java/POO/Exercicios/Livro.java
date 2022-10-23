package POO.Exercicios;

import java.util.ArrayList;

public class Livro {

    /*Crie uma classe Livro que possui:
            * Atributos: nome, autor, preco;
	* Construtores:
            - Cria livros com base nos parâmetros nome, autor(objeto da classe Autor), preco;*/

    private String nome;
    private Autor autor; //Informações do Autor
    //Composição
    private double preco;

    Livro(String nome, Autor autor, double preco){
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        Autor jk = new Autor("JK", "jk@gmail.com");
        Livro pedraFilosofal = new Livro("Harry Potter e a Pedra Filosofal", jk, 24.9);

        System.out.println(pedraFilosofal.autor.getNome());
        System.out.println(pedraFilosofal.autor.getEmail());

        Livro camaraSecreta = jk.escreverLivro("Harry Potter e a Câmara Secreta", 30.0);

        Livro prisioneiroAzk = jk.escreverLivro("Harry Potter e o prisioneiro de Azkaban", 40.0);

        jk.setNome("BATATA");

        System.out.println(pedraFilosofal.autor.getNome());
        System.out.println(camaraSecreta.autor.getNome());
        System.out.println(prisioneiroAzk.autor.getNome());

        ArrayList<Livro> livrosJk = new ArrayList<>();
        livrosJk.add(pedraFilosofal);
        livrosJk.add(camaraSecreta);
        livrosJk.add(prisioneiroAzk);

        System.out.println(livrosJk);
    }
}
