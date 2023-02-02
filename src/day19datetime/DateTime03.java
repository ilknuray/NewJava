package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {
        //EX1:Japonya ile almanya arasindaki zaùan farkini hesaplayan kodu yaziniz
        LocalDateTime almanya = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        LocalDateTime japonya = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        Long fark = ChronoUnit.HOURS.between(almanya, japonya);
        System.out.println("fark = " + fark);
    }
}
