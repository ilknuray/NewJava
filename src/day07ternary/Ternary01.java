package day07ternary;

public class Ternary01 {
    public static void main(String[] args) {
        //EX:Bir sayinin pozif olup olmadigini ekrana yazdiran kodu yazdirin

        int sayi = 15;

        //1.YOL
        if (sayi > 0) {
            System.out.println("pozitif sayi");
        } else {
            System.out.println("Sayi negatif");
        }
        //2.YOL
        String sonuc = sayi > 0 ? "Pozitif" : "Negatif";
        System.out.println(sonuc);
        //     Condition   ?   true   :false

        //EX:iki sayidan kucuk olani yaziniz

        int a = 15;
        int b = 20;

        int kucuksayi = a < b ? a : b;
        System.out.println("kucuksayi = " + kucuksayi);

        //EX:Verilen bir sayinin mutlak degerini hesaplayan kodu yazdiriniz

        int d = -15;

        int mutlakDeger = d < 0 ? d * -1 : d;

        System.out.println("mutlakDeger = " + mutlakDeger);

        //EX:iki tane sayi ayni isaretli ise  unlari carpiniz farkli ise "islem yapapam" mesaji veriniz

        int e = 15;
        int f = 20;

        Object islem = (e > 0 && f > 0 )|| (e < 0 && f < 0) ? e * f : "islem yapamam";
        System.out.println("islem = " + islem);
        //ternary farkli data turlerinde sonuc return ederse sonucun data tipini object yapiniz
        //java'da her classin en az 1 tane parenti classi  vardir.sadece object classin parent classi yoktur


    }
}
