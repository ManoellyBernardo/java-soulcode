package POO.Exercicios;

public class InstagramNotificador implements Notificador {

    /*Crie uma classe InstagramNotificador implements Notificador:
    Atributos: nomeUsuario
    Construtores: Crie objetos com base no nomeUsuario
    Métodos:
        - @Override notificar(String msg)*/

    private String nomeUsuario;

    public InstagramNotificador(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public void notificar(String msg) {
        System.out.println("Notificação para o Instagram");
    }
}
