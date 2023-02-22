package day32maps;

import java.util.ArrayList;
import java.util.List;

public class Iterators01 {
    public static void main(String[] args) {
        List<String>myList=new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");
        System.out.println("myList = " + myList);
        //foreach kullanarak her elemanin sonuna ! koyunuz.
        for (String w:myList) {
            w=w+"!";
        }
        System.out.println(myList);
        //looplar kendi baslarina collectionlari update edemezler.bu yuzden java iteratorlari olusturdu.
        //iteratolar collectionlari update etmek icin kullanilir.L


    }
}
