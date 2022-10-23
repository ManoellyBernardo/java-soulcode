package POO.Exercicios;

public class TelefoneNotificador implements Notificador{

    /*Crie uma classe TelefoneNotificador implements Notificador:
    Atributos: numero
    Construtores: Crie objetos com base no numero
    Métodos:
        - @Override notificar(String msg)*/

    private String numero;

    public TelefoneNotificador(String numero) {
        this.numero = numero;
    }

    @Override
    public void notificar(String msg) {
        System.out.println("Notificação para o telefone");
    }
}
