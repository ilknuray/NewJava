package day31maps;

import java.util.*;

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


        HashMap<String, Integer> studentsAge = new HashMap<>();
        studentsAge.put("Ali", 13);
        studentsAge.put("Tom", 21);
        studentsAge.put("Brad", 12);
        studentsAge.put("Ayse", 24);
        studentsAge.put("brad", 33);
        studentsAge.put("Ajda", 80);
        studentsAge.put("Ali", 15);//tekrar kullaninca hata vermez override yapar ustune yazar
        studentsAge.put(null, 66);
        studentsAge.put(null, 76);
        studentsAge.put("Ahmet", null);
        studentsAge.put("sadri", null);//value olarak null tekrar tekrar kullanilabilir
        System.out.println(studentsAge);

        //sadece keyleri almak istiyorum nasil yaparim
        Set<String> keys = studentsAge.keySet();//key unique oldugu icin setin icine koyar cunku setlerde unique valueler kalir
        System.out.println(keys);

        //Sadece value lari nasil alirim
        Collection<Integer> values = studentsAge.values();
        System.out.println(values);//en son guncellenmis halini verir.hashmaplerde siralama yoktur

        //belli bir keye ait value nasil alinir
        Integer yas = studentsAge.get("Ayse");//verilen key e ait value u dondurur
        System.out.println("yas : " + yas);

        //EX1:tum integer yaslarin ortalamasini bulan kodu yaziniz

        int ortalamaYas = 0;
        int count = 0;

        for (Integer w : values) {
            if (w != null) {
                ortalamaYas += w;
                count++;

            }


        }
        System.out.println("Ortalama yas = " + (ortalamaYas / count));


        //EX2:a ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz.
        Set<String> isimler = studentsAge.keySet();
        int isim = 0;
        for (String w : isimler) {
            if (w != null && !w.startsWith("A")) {
                isim += w.length();
            }
        }
        System.out.println(isim);

        boolean sonuc = studentsAge.remove("Ajda", 80);//key ve value olan entry set i siler ve size boolean return eder.
        System.out.println("sonuc = " + sonuc);

        Integer kisi = studentsAge.remove("Ali");
        System.out.println("kisi = " + kisi);//verdigim key deki value u bana dondurur

        studentsAge.getOrDefault("Brat", 0);//key varsa var olan degeri verir yoksa benim yazdigim degeri verir

        //value null ise ekleme yapar value null degilse eklme yapmaz ve key yoksa olusturur ve ekleme yapar
        Integer merve = studentsAge.putIfAbsent("Merve", 200);
        System.out.println("merve = " + merve);
        System.out.println(studentsAge);

        //replace methodu value lari degistirmek icin kullanilir
        studentsAge.replace("Merve", 35);
        System.out.println(studentsAge);

        //EX3:mapteki herbir entryi farkli satirda yazdirin
        //entryset methodu mapteki her elememanlari bir setin icine koyarak size verir
        //methodlarin icine gelip ustune tikla ne verdigini nasil kullanildigini gor
        Set<Map.Entry<String, Integer>> altalta = studentsAge.entrySet();//bu sekilde ki bir yontemle hepsini altalta yazdiririm.

        for (Map.Entry<String, Integer> w : altalta) {
            System.out.println(w);

        }
    }
}