package basicPractice;

import java.util.Scanner;

public class IfStatements08 {
    public static void main(String[] args) {
        /*
        Kullanicidan 4 basalkli sayi isteyin
        sayi 5 e bolunuyorsa son rakamini kontrol edin
        son rakami 0 ise ekrana 5e bolunen cift sayi
        son rakami 0 degilse 5e bolunen tek sayi
        say 5 e bolunmuyorsa tekrar deneyin yazdirin
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tam sayi giriniz");
        int sayi = sc.nextInt();




        if (sayi % 5 == 0) {
            if (sayi%10 == 0) {
                System.out.println("Bese bolunen cift sayi");
            } else {
                System.out.println("Bese bolunen tek sayi");
            }
        } else
            System.out.println("Tekrar deneyin");


        if (sayi > 0 && sayi < 10000) {
            System.out.println("4 basakli sayi giriniz");
        } else if (sayi % 5 == 0) {
            if (sayi%10 == 0) {
                System.out.println("5e bolunen cift sayi");

            } else {
                System.out.println("5e bolunen tek sayi");
            }

        } else {
            System.out.println("Tekrar deneyin");
        }
    }
}

