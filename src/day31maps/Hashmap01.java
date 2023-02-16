package day31maps;

import java.util.HashMap;
import java.util.HashSet;

public class Hashmap01 {
    /*
    1)Mapler key value structure ini kullanirlar.
    2)Key kismi unique olmalidir.benzersiz datalar icermelidir,Value kismi uniqe olmak zorunda degildir
    3)Key kismi null olamaz,ama value kismi null olabilir
    4)Entry denir key-value ikilisine eleman yerine entry-set denir
    5)Eklenen datalari siralamak ile ilgilenmez super fast calisirlar
    primitiveler hic bir collections ve maps te kullanilamaz
     */
    public static void main(String[] args) {


        HashMap<String, Integer>studentsAge  = new HashMap<>();
        studentsAge.put("Ali",13);
        studentsAge.put("Tom",21);
        studentsAge.put("Brad",12);
        studentsAge.put("");
        studentsAge.put("");
        studentsAge.put("");
        System.out.println(studentsAge);


    }
}