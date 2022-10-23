package POO.Exercicios;

public class EmailNotificador implements Notificador{

    /*Crie uma classe EmailNotificador implements Notificador:
    Atributos: email
    Construtores: Crie objetos com base no email
    Métodos:
        - @Override notificar(String msg)*/

    private String email;

    public EmailNotificador(String email) {
        this.email = email;
    }

    @Override
    public void notificar(String msg) {
        System.out.println("Notificação para o email");
    }
}
