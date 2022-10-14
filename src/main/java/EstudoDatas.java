import java.time.LocalDate;

public class EstudoDatas {

    public static void main(String[] args) {
        //dia - mês - ano
        //LocalDate armazena qualquer data (doa, mês, ano)
        LocalDate diaHoje = LocalDate.now(); //pega a data atual
        System.out.println(diaHoje);

        LocalDate natal = LocalDate.of(2022,12,25);
        System.out.println(natal);

        System.out.println(diaHoje.isAfter(natal)); //Verifica se a data é depois da data especificada
        System.out.println(diaHoje.isBefore(natal)); //Verifica se a data é antes da data especificada

        int ano = diaHoje.getYear(); //informa o ano da data
        int mes = diaHoje.getMonthValue(); //informa o número do mês
        int dia = diaHoje.getDayOfMonth(); //informa o número do dia do mês

        int diasParaNatal = natal.getDayOfYear() - diaHoje.getDayOfYear(); //subtrai o dia do Natal pelo dia de Hoje


    }
}
