package day32maps;

import java.util.Hashtable;

public class Haashtable02 {

    public static void main(String[] args) {
        /*
        *hashtable bir maptir
        * **hashtable entrysetleri bir siralamaya tabi tutmaz
        * **hashmapten yavastir,cunku hash tabletreadsafedir ve syncronzed dir.Bunu planlamak icin zaman harcar.
        * Key null olamaz nullpointerexception atar.
        * value null olamaz null pointerexception atar
        *
        *
         */
        Hashtable<String,Integer>countryPopolation=new Hashtable<>();
        countryPopolation.put("USA",400000000);
        countryPopolation.put("Germany",83000000);
        countryPopolation.put("Turkey",90000000);
        System.out.println(countryPopolation);
        //countryPopolation.put(null,9000000);//Key null olamaz nullpointerexception atar.
        //countryPopolation.put("Fransa",null);//value null olamaz null pointerexception atar
        Hashtable<String,Students>myStudnts=new Hashtable<>();
        myStudnts.put("Math",new Students("tom","tom@gmail.com",21,true));
        System.out.println("myStudnts = " + myStudnts);
        /*
        toString() methodu objectleri consolda detaylari iler birlikte gorebilmek icin konsolda olustururlur
        toString kullanmadan yazdirirsak objenin adresini goruruz
         */
    }
}
