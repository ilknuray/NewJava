package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
    }
}
