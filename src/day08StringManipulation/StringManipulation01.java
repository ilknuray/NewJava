package day08StringManipulation;

import java.util.Scanner;

public class StringManipulation01 {
    public static void main(String[] args) {
        //kullancidan aldiginiz ismin ilk ve son hafini yazdirin

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = sc.next().toLowerCase();

        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(isim.length() - 1);
        System.out.println("" + ilkHarf + sonHarf);

        //yazdigimiz kod sadece bazi durumlar icin calisiyorsa o code "Hard Coding" denir iyi bir durum degildir
        //yazdigimiz code her durum icin calisirsa bu code a dynamic code denir
        //char i string gibi hemen yazdiramazsin string koymayi unutma

        //2.YOL
        String yeniHal = isim.substring(0, 1) + isim.substring(isim.length() - 1);
        System.out.println(yeniHal);



        //EX:verilen stringteki tum hayvan isimlerini ekrana yazdiriniz
        // "ben kedi,esim tavuk,oglum sever inek"

        String cumle = "ben kedi,esim tavuk,oglum sever inek";

        String hayvanlar = cumle.substring(4, 8) + " " + cumle.substring(14, 19) + " " + cumle.substring(32, 36);
        System.out.println(hayvanlar);

        //EX: ilk isim ve soy isim iceren isimleren ilk ve soyismin bas harflrini aliniz
        System.out.println("Lutfen isminizi ve soy isminizi giriniz");
        String isimSoyisim = sc.nextLine();

        String a= isimSoyisim.substring( 0,1);
        String b = isimSoyisim.split(" ")[1].substring(0, 1);
        System.out.println("basHarfler = " +(a+b));


    }
}
