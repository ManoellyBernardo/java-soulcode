package POO.Escola;

public class Aluno extends Pessoa {

    private double media;

    //o super deve vim sempre em primeiro
    public Aluno(String nome, String email, String cpf, double media) {
        super(nome, email, cpf); //estou chamando um construtor de Pessoa
        this.media = media;
    }

    @Override
    public void apresentar(){ //na sobrescrita mudamos o comportamento
        super.apresentar();
        System.out.println("Eu sou um aluno com média " + this.media);
    }

    public double getMedia() {
        return media;
    }
}
