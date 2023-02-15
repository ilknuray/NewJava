package day30collections;

import java.util.HashSet;

public class Hashset01 {
    public static void main(String[] args) {
    //birbirine benzemeyen data olusturmaya yarar.orneginuniversite ogrenci numarasi gibi bolum kodu+ogrencino+universite kodu+fakulte kodu
        /*
        1)Hash bir tkniktir.birbirine benzemeyen kodlar uretir bunlar datayi unique yapar
         */
        HashSet<String>emails=new HashSet<>();
        emails.add("apple");
        emails.add("mango");
        emails.add("orange");
        emails.add("apricot");
        emails.add("fig");
        System.out.println("emails = " + emails);
        emails.add("mango");
        System.out.println(emails);//ayni elemani eklersek hata vermez ayni elemani olan elmanin ustune yazdigi icin tekra gormeyiz.override yapar
        emails.add(null);
        System.out.println(emails);
    }
}
