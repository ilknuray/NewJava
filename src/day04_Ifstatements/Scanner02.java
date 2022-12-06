package day04_Ifstatements;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
        ex:kullanicidan ilk ve soy ismini aliniz ve sadece bas harflerini yazdiriniz
        ilknur yilmaz ==>iy
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminizi giriniz");
        char isim = scan.next().charAt(0);
        char soyisim = scan.next().charAt(0);
        System.out.println(isim + soyisim);//==>Matematiksel islem koyarsak charlar arasina ascii valueleri verir
        System.out.println("" + isim + soyisim);//string olarak yazdirmak icin chari stringe ceviririm bunun icin "" kullanirim ve stringe ceviririm
      /*
      java da "+" isaretinin iki anlami vardir 1)toplam 2)Birlestirme concatenation
      java bu isareti gorunce once toplama yapmaya calisir yapamazsa birlestime yapar
       */

        // 2.yol
        System.out.println("Tam isminizi giriniz");
        String tamisim = scan.nextLine();
        char ilkHarf = tamisim.charAt(0);
        char soyIsimIlkHarf = tamisim.split(" ")[1].charAt(0);
        System.out.println("" + ilkHarf + soyIsimIlkHarf);

    }
}
