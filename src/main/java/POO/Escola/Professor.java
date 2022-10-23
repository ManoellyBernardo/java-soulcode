package POO.Escola;

public class Professor extends Pessoa{

    private String formacao;

    public Professor(String nome, String email, String cpf, String formacao) {
        super(nome, email, cpf);
        this.formacao = formacao;
    }

    @Override// anotação - que indica sobrescrita
    public void apresentar(){
        super.apresentar();
        System.out.println("Eu sou um professor com formação em " + this.formacao);
    }

    public String getFormacao() {
        return formacao;
    }
}
