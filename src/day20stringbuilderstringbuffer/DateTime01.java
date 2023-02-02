package day20stringbuilderstringbuffer;

import java.time.LocalDate;
import java.time.Month;

public class DateTime01 {
    public static void main(String[] args) {
        //EX7:Tom ali den 3 yil 8 ay 13 GUN SONRA DOGDU,ali ise veliden 1yil 15 gun once dogdu
        // tom un dogum tarihi 18.11.2011 ise digrlrinin kini bulunuz

        LocalDate dtTom=LocalDate.of(2011, Month.NOVEMBER,18);
        LocalDate dtAli=dtTom.minusYears(3).minusMonths(8).minusDays(13);
        LocalDate dtVeli=dtAli.plusYears(1).plusDays(15);

    }
}
