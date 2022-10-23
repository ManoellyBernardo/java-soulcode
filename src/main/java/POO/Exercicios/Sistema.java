package POO.Exercicios;

public class Sistema {

    /*Crie uma classe Sistema:
    Atributos: notificador
    Construtores: Cria objetos com base no notificador (da Interface);
    Métodos:
        - alertaSistema() => este método invoca o notificador e envia mensagem de alerta;
        - sobrecargaSistema() => este método invoca o notificador e envia mensagem de sobrecarga;

Obs: O atributo notificador da classe Sistema deve ser do tipo Notificador.*/

    Notificador notificador;

    public Sistema(Notificador notificador) {
        this.notificador = notificador;
    }

    public void alertaSistema(){
        System.out.println( this.notificador + " mensagem de alerta.");
    }

    public void sobrecargaSistema(){
        System.out.println( this.notificador + " mensagem de sobrecarga.");
    }
}
