package day04_Ifstatements;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*kullanicidan ismini soyismini ve tec sini alip
        isim soyisim
        tc
           olarak yazdiriniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        String isim= scan.next();
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim=scan.next();
        System.out.println("Lutfen tc nizi giriniz");
        String tc= scan.next();

        System.out.println(isim+" "+soyisim+"\n"+tc);

    }
}
