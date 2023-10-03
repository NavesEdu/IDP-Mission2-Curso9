import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2034, Month.JUNE, 5);
//        int anos = olimpiadasRio.getYear() - hoje.getDayOfYear();
//        System.out.println(anos);

        LocalDate localDate = olimpiadasRio.plusYears(4);
        System.out.println(localDate);

        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(agora.format(formatador));

    }

}
