package day19datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //EX1:javadan aldiginiz date i ay gun yil olark yaziniz
        LocalDate currrentDate=LocalDate.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatedDate=dtf.format(currrentDate);
        System.out.println("formatedDate = " + formatedDate);

    }
}
