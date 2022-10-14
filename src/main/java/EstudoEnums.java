//Estruturas são estruturas com constantes definitivas
//Dias da semana, meses do ano, turnos do dia, Estações do ano
//Niveis (junior, pleno, senior), feariados nacionais

public class EstudoEnums {
    public static void main(String[] args) {

        enum DiaSemana {
            SEGUNDA,
            TERÇA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }

        DiaSemana hoje = DiaSemana.QUINTA;
        System.out.println(hoje);

        enum NivelDev {JUNIOR, PLENO, SENIOR}

        NivelDev nivel = NivelDev.PLENO;

        switch (nivel){
            case JUNIOR:
                System.out.println("Você é JUNIOR.");
                break;
            case PLENO:
                System.out.println("Você é PLENO.");
                break;
            case SENIOR:
                System.out.println("Você é JUNIOR.");
                break;
        }

        // VERSÃO ENHANCED
        switch(nivel) {
            case JUNIOR -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nível é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }

    }
}
