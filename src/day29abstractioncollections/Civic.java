package day29abstractioncollections;

public class Civic implements Ac, Motor {

    @Override
    public void run() {
        //interfacelerde methodbodysi olmadigi icin override ederken ikisinde ayni method olsa ile sikinti olmaz
        //bodysi olan methodlarda detay verilir ancak abstract methodlarda yani method bodysi olmayn methodlar
        // sadece ne yapacagini soyler nasil yapacagini soylemez(what to do==>soyler)
        //concrate methodlar ise hem what to do hem how to do yu belirler
        //interfaceler yapilacak isler listesidir(To do list)child classlara yapilacak isleri soylemis oluruz
        //return type lar farkli olacaksa method isimleri ayni olmaz
        //multiple parent iterface  kullandiginizda ayni method ismi ile birden fazla
        // method olusturursaniz methodlarin return type lari ayni olmalidir.aksi halde hata verir

        System.out.println("Civic iyi calisir");
    }



}
