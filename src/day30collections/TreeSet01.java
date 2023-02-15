package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        /*
        Treeset tekrarsiz elemanlari alfabetik siraya yada kucukten buyuge dogru dizer5Natural order)
        Bu ciddi bir emek ister bu yuzden treeset cok yavas calisir
        gercekten bir siralama sartsa bunu kullaniriz

         */

        //EX:1 8 tane unique string elemani alfabetik sirada depolayiniz
        Long start1=LocalTime.now().toNanoOfDay();
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
        Long end1= LocalTime.now().toNanoOfDay();
        System.out.println(end1-start1);

        HashSet<String>myEmails=new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("d@gmail.com");
        myEmails.add("e@gmail.com");
        myEmails.add("f@gmail.com");
        myEmails.add("g@gmail.com");
        myEmails.add("h@gmail.com");
        System.out.println(myEmails);


        TreeSet<String>sortedMyEmails=new TreeSet<>(myEmails);
        System.out.println(sortedMyEmails);
        Long end2=LocalTime.now().toNanoOfDay();
        System.out.println(end2-end1);
        /*
        ****interviewwww
        * 100 tekrarasiz datayi collectionslarda alfabetik siraya gore siralayin
        * treeset kullanirim bu yavastir yavaslik problemini nasil cozersin elemanlari eklemede hashset i kullanirim
        *elemanlari ekledikten sonra hashset i treesete ceviririm siralamada ise treeseti kullanirim
         */





    }
}
