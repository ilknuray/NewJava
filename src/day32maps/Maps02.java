package day32maps;

import java.util.HashMap;

public class Maps02 {
    //Size verilen bir kelimede kullanilan harflerin kac kere kullanildigini gosteren kodu yaainiz
    public static void main(String[] args) {
        String str = "abbcaa";
        String[] harfler = str.split("");

        HashMap<String, Integer> kacKere = new HashMap<>();
        for (String w : harfler) {
            Integer harfSayisi = kacKere.get(w);
            if (harfSayisi == null) {
                kacKere.put(w, 1);
            } else {
                kacKere.put(w, harfSayisi + 1);
            }

        }
        System.out.println(kacKere);
    }

}
