package day30collections;

import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        /*
        Treeset tekrarsiz elemanlari alfabetik siraya yada kucukten buyuge dogru dizer5Natural order)
        Bu ciddi bir emek ister bu yuzden treeset cok yavas calisir
        gercekten bir siralama sartsa bunu kullaniriz

         */

        //EX:1 8 tane unique string elemani alfabetik sirada depolayiniz
        TreeSet<String>emails=new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("b@gmail.com");
        emails.add("c@gmail.com");
        emails.add("d@gmail.com");
        emails.add("e@gmail.com");
        emails.add("f@gmail.com");
        emails.add("g@gmail.com");
        emails.add("h@gmail.com");
        System.out.println("emails = " + emails);

    }
}
