package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime01 {
    public static void main(String[] args) {
        //EX1:Anlik tarihi ekrana yazan kodu yaziniz
        LocalDate currentDate=LocalDate.now();//bulundugum mekandaki anlik tarihi verir.object olusturmanin baska bir yoludur.
        //new deersem yeni 0dan olustururum.now dersem donustururum.Var olninkullanirim
        System.out.println("currentDate = " + currentDate);

        //EX2:anlik zamani ekrana yazdiran kodu yaziniz
        LocalTime currentTime=LocalTime.now();
        System.out.println("currentTime = " + currentTime);

        //EX3:anlik tarihi ve anlik zamni ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime);

        //EX4:Japonyadaki anlik tarih ve zamani ekrana yazan kodu yaziniz

        LocalDateTime currentDateTimeJapon=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("currentDateTimeJapon = " + currentDateTimeJapon);

        LocalDateTime currentDateTimeIstanbul=LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("currentDateTimeIstanbul = " + currentDateTimeIstanbul);
    }
}
