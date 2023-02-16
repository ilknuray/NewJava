package day31maps;

import java.util.HashMap;
import java.util.HashSet;

public class Hashmap01 {
    /*
    1)Mapler key value structure ini kullanirlar.
    2)Key kismi unique olmalidir.benzersiz datalar icermelidir,Value kismi uniqe olmak zorunda degildir
    3)Key kismi null olabilir tekrarsiz sekilde kullanilabilir,ama value kismi null olabilir
    4)Entry denir key-value ikilisine eleman yerine entry-set denir
    5)Eklenen datalari siralamak ile ilgilenmez super fast calisirlar
    primitiveler hic bir collections ve maps te kullanilamaz
     */
    public static void main(String[] args) {


        HashMap<String, Integer>studentsAge  = new HashMap<>();
        studentsAge.put("Ali",13);
        studentsAge.put("Tom",21);
        studentsAge.put("Brad",12);
        studentsAge.put("Ayse",24);
        studentsAge.put("brad",33);
        studentsAge.put("ajda",80);
        studentsAge.put("Ali",15);//tekrar kullaninca hata vermez override yapar ustune yazar
        studentsAge.put(null,66);
        studentsAge.put(null,76);
        studentsAge.put("ahmet",null);
        studentsAge.put("sadri",null);//value olarak null tekrar tekrar kullanilabilir
        System.out.println(studentsAge);


    }
}