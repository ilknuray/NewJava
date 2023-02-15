package day30collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> isimler = new LinkedList<>();
        isimler.add("chris");
        isimler.add("jeremy");
        isimler.add("mark");
        isimler.add("alexandre");
        isimler.add("paul");
        isimler.add("tom");
        System.out.println("isimler = " + isimler);

        String ilkEleman = isimler.peek();//ilk elementi yani head i alir alir ancak silmez.ilk elemani bize veri listbossa null verir
        System.out.println("ilkEleman2 = " + ilkEleman);

        LinkedList<String>myList= new LinkedList<>();
        String ilk=myList.peek();
        System.out.println("ilk = " + ilk);

       String first= isimler.poll();//ilk elemani sile bize verir ancak bssa hatafirlatmaz null dondurur pop ile arasidaki fark budur
        System.out.println("first = " + first);
        System.out.println("isimler3 = " + isimler);

        //EX1: a ile baslayan tum isimleri "*****" e ceviriniz

        for (String w:isimler) {
            if (w.startsWith("a")) {
                isimler.set(isimler.indexOf(w), "*****");
            }
        }
        System.out.println("isimler2 = " + isimler);

    }
}
