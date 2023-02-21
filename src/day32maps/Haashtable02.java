package day32maps;

import java.util.Hashtable;

public class Haashtable02 {

    public static void main(String[] args) {
        /*
        *hashtable bir maptir
        * **hashtable entrysetleri bir siralamaya tabi tutmaz
        * **hashmapten yavastir,cunku hash table treadsafedir ve syncronzed dir.Bunu planlamak icin zaman harcar.
        *
        *
         */
        Hashtable<String,Integer>countryPopolation=new Hashtable<>();
        countryPopolation.put("USA",400000000);
        countryPopolation.put("Germany",83000000);
        countryPopolation.put("Turkey",90000000);
        System.out.println(countryPopolation);
        countryPopolation.put(null,9000000);//Key null olamaz nullpointerexception atar.
    }
}
