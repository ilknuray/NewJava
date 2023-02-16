package day31maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        HashMap<String,Double>salaries=new HashMap<>();//bu kodu yazdigimizda java 16bytlik bir alan hazirlar
        salaries.put("QA",100.00);
        /*
        1)siz HashMap<String,Double>salaries=new HashMap<>(); olusturdugunuzda java memoryde 16 kutu iceren bir yapi olusturur
        ve bu yapidaki herbir kutuya index verir.indexler 0 dan 15 e kadardir
        2)siz salaries.put() kodunu yazdiginizda java key icin bir hashcode olusturur bu hashcodu  15 E BOLER ve kalan sayiyi index olarak
        belirler.bu elemani o indexe yerlestirir
        3)yerlestirirken 4 lu bir yapi olusturur bu yapinin ilk bolumune hashcodu ikinci bolume key i ucuncu bolume value yu dorduncu bolume
        pointeri koyar.bu cok bolumlu yapi linkedlistteki node yapisidir.Yani hashmap kutulari koydugu datalari linkedlist depolar
         */
    }
}
