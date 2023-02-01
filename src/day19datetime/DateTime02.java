package day19datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //EX1:javadan aldiginiz date i ay gun yil olark yaziniz
        LocalDate currrentDate=LocalDate.now();
        System.out.println("currrentDate = " + currrentDate);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatedDate=dtf.format(currrentDate);
        System.out.println("formatedDate = " + formatedDate);

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formatedDate2=dtf2.format(currrentDate);
        System.out.println("formatedDate2 = " + formatedDate2);

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formatedDate3=dtf3.format(currrentDate);
        System.out.println("formatedDate3 = " + formatedDate3);

    }
}
