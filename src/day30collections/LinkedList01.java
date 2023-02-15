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

    }
}
