package day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {
        /*
        linkedhash setler elemanlari ekleme sirasina gore yerlestirirler
        Linked hashset elemanlari girilen siralamaya gore olusturdugu icin yavas calisir

         */
        LinkedHashSet<String>emails=new LinkedHashSet<>();
        emails.add("abc@gmail.com");
        emails.add("def@gmail.com");
        emails.add("ghi@gmail.com");
        emails.add("jkl@gmail.com");
        emails.add("mno@gmail.com");
        System.out.println("emails = " + emails);

    }
}
