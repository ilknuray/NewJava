package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {
    /*
    arraylist==>index kullanir bunun dezavantajlari vardir eleman eklesemde silsemde butun sistem bozulur cunku indexler degisir

     */
    /*
    LINKED LIST ELEMAN SILME VE EKLEME DE COK ETKILIDIR BU YUZDEN ELEMAN SILME VE EKLEME YAPACAGINIZ DURUMLARDA LINKD LIST KULANMALISINIZ
    ornegin:muze application i gibi giren cikan oluyor surekli.eger u sekilde yapmazsak donar

    arraylist eleman bulma search islmelerinde cok basarilidir linked list ise search islemlerinde basarisizdir
    oregin sozluk app i hazirliyorsanuz ve cok sik arama yapacaksaniz arraylist kullanmamiz mantiklidir

    linked listteki her eleman iki bolumden olusur data ve pointer bolumu
    her eleman node olarak adlandirilir
    linked listler eleman ekleme ve cikarmada cok basarilidirlar
    eleman arama durumlarinda basarisizdirlar
    array listler index kullanir linked listler kullanmazlar
    index kullanmak eleman bulma islemleerinde cok basarilir.bu yuzden eleman bulma islemlerini cok fazla kullanacaksaniz arrayList kullanmalisiniz


     */
    public static void main(String[] args) {
        LinkedList<String>visitors=new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom HANKS");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brat Pitt");
        visitors.add(2,"Angelina Julie");

        System.out.println("visitors = " + visitors);

    }

}
