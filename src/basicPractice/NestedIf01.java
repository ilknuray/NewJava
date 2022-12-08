package basicPractice;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
        kullanicidan iki sayi isteyin
        ikiside pozitifse toplamini yazdirin
        ikide negatifse carpim
        farkli isaretlerse islem olmaz
        0 a esit olan varsa sifir yutan elemen yazdirin
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        int sayi1 = sc.nextInt();
        int sayi2 = sc.nextInt();

        if (sayi1 == 0 || sayi2 == 0) {
            System.out.println("0 carpya gore yutan elemandir");
        } else if (sayi1>0 && sayi2>0){
            System.out.println(sayi2+sayi1);
        }else if (sayi1<0 && sayi2<0){
            System.out.println(sayi2*sayi1);
        } else if(sayi1*sayi2<0) {
            System.out.println("Farkli islemlerle islem yapilamaz");
        }else
            System.out.println("Lutfen gecerli bir rakam giriniz");
    }
}