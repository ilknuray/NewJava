package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {
        //EX1:Japonya ile almanya arasindaki zaùan farkini hesaplayan kodu yaziniz
        LocalDateTime almanya = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        LocalDateTime japonya = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        Long fark = ChronoUnit.HOURS.between(almanya, japonya);
        System.out.println("fark = " + fark);

        //EX2:sabit bir tarih olusturunuz
        LocalDate trh=LocalDate.of(2011, Month.DECEMBER,21);
        System.out.println("trh = " + trh);

        /*
        Javada sabit datalari (ay yil gun isimleri,amerika eyalet isimleri gibi);
        sabit datalari saklamak ve gerektiginde kullanmak icin sabit dtalar konur ve bunlara "Enum" denir.
         */

        //EX3:USA ICIN wOOOW YAIN uk ICIN big CANADA icin Cold TURKEY icin Vatan..
        Countries coutry=Countries.USA;

        switch (coutry){
            case UK:
                System.out.println("Big");
                break;
            case USA:
                System.out.println("Wooow");
                break;
            case FRANCE:
                System.out.println("Kruvasan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case CANADA:
                System.out.println("cold");
                break;
            case RWANDA:
                System.out.println("cay");
                break;
            default:
                System.out.println("Tanimlanmamis ulke");
        }
    }
}
