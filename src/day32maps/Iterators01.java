package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");
        System.out.println("myList = " + myList);
        //foreach kullanarak her elemanin sonuna ! koyunuz.
        for (String w : myList) {
            w = w + "!";
        }
        System.out.println(myList);
        //looplar kendi baslarina collectionlari update edemezler.bu yuzden java iteratorlari olusturdu.
        //iteratolar collectionlari update etmek icin kullanilir.
        //iterator i 0 dan olusturmayiz.ELIMIZDEKI LISTTEN ITERATOR OLUSTURURUZ;hasnext ve next methodlari ile kullanabiliriz.

        ListIterator<String> itr = myList.listIterator();
        while (itr.hasNext()) {//liste gider ve pointer i enbaasa koyar sonra diger elemanin onune pointeri koyar ve ustunden atladigi elemeni yazdirir
            //iterator genellikle while ile kullanilir
            String eleman = itr.next();
            itr.set(eleman + "!");
            //hasnext methodu pointerdan sonra eleman varsa true degilse false verir next ise pointeri ir sonraki elemanin onune koyar ve atladigi elemani yazdirir

        }
        System.out.println(myList);
        //listteki tum elemanlari siliniz
        while (itr.hasPrevious()){
            itr.previous();
            itr.remove();//sildirir
        }
        System.out.println(myList);


    }
}
