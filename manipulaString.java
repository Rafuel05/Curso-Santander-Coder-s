import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class manipulaString {
    public static void main(String[] args) {
        // Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.

        String nome = "Rafael";

        // ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale Brasil = new Locale("pt", "BR");
        // Locale Brasil = new Locale( "pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() <12) {
            saudacao ="Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() <18) {
            saudacao = "Boa Tarde";
        } else if (agora.getHour() >=18 && agora.getHour() <24) {
            saudacao = "Boa Noite";
        } else {
            saudacao = "Olá.";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase(Locale.ROOT));

    }
}