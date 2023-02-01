package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {
        //EX1:Anlik tarihi ekrana yazan kodu yaziniz
        LocalDate currentDate = LocalDate.now();//bulundugum mekandaki anlik tarihi verir.object olusturmanin baska bir yoludur.
        //new deersem yeni 0dan olustururum.now dersem donustururum.Var olninkullanirim
        System.out.println("currentDate = " + currentDate);

        //EX2:anlik zamani ekrana yazdiran kodu yaziniz
        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);

        //EX3:anlik tarihi ve anlik zamni ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime);

        //EX4:Japonyadaki anlik tarih ve zamani ekrana yazan kodu yaziniz

        LocalDateTime currentDateTimeJapon = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("currentDateTimeJapon = " + currentDateTimeJapon);

        LocalDateTime currentDateTimeIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("currentDateTimeIstanbul = " + currentDateTimeIstanbul);

        //EX5:Bugunden 789 gun sonra emekli olacginiza gore emeklilik tarihini hesaplayan kodu yaziniz
        LocalDate countDate = LocalDate.of(2023, 2, 1);
        LocalDate emeklilikNezaman = countDate.plusDays(789);
        System.out.println("emeklilikNezaman = " + emeklilikNezaman);

        //EX6:Iki cocugunuz dogum tarihleri arasindaki farki bulan kodu yaziniz
        LocalDate dtMelih = LocalDate.of(2013, 7, 14);
        LocalDate dtSenih = LocalDate.of(2018, 1, 15);

        Long fark=ChronoUnit.DAYS.between(dtMelih,dtSenih);//gecmis tarih once yazilmalidir between tarihi kullanildiginda.
        System.out.println("fark = " + fark);

        //EX7:Tom ali den 3 yil 8 ay 13 GUN SONRA DOGDU,ali ise veliden 1yil 15 gun once dogdu
        // tom un dogum tarihi 18.11.2011 ise digrlrinin kini bulunuz

        LocalDate dtTom=LocalDate.of(2011,11,18);
        LocalDate dtAli=dtTom.plusYears(3).plusMonths(8).plusDays(13);
        LocalDate dtVeli=dtAli.minusYears(1).minusDays(15);
        System.out.println("dtVeli = " + dtVeli);
        System.out.println("dtAli = " + dtAli);
        System.out.println("dtTom = " + dtTom);

        //EX8:Istanbulun fethi ile cumhuriyetin kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz
        LocalDate istFethi=LocalDate.of(1453,5,29);
        LocalDate cumhuriyet=LocalDate.of(1923,10,29);
        Long ayFarki=ChronoUnit.MONTHS.between(istFethi,cumhuriyet);
        System.out.println("ayFarki = " + ayFarki);


    }
}
