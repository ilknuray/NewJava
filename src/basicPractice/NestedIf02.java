package basicPractice;

import java.util.Locale;
import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
        /*
        Kullanici 0 'Dan kucuk 120 den buyuk deger giremeyecek sekilde degerleri aldiktan sonra
        eger calisan kadinsa 60 tan buyukse emekli olur
        eger erkekse 65 ten buyukse emekli olur
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = sc.nextInt();
        System.out.println("Lutfen cinsiyetinizi yaziniz");
        char cinsiyet = sc.next().toUpperCase().charAt(0);

        if (cinsiyet == 'K') {
            if (yas > 120 || yas < 0) {
                System.out.println("Lutfen dogru yas giriniz");
            } else if (yas > 60) {
                System.out.println("emekli olabilirsin");
            } else {
                System.out.println("emekli olamazsin : " + (60 - yas) + " sene daha czlismlisin");
            }
        } else if (cinsiyet == 'E') {
            if (yas > 120 || yas < 0) {
                System.out.println("Lutfen dogru yas giriniz");

            } else if (yas > 65) {
                System.out.println("emekli olabilirsin");

            } else {
                System.out.println("emekli olamazsin : " + (65 - yas) + " sene daha calismalisin");
            }
        } else
            System.out.println("Gecerli bir deger giriniz");
    }
}
