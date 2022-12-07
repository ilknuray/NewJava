package basicPractice;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //kullanicinin girdigi 4 basamali sayinin ilk ve son rakaminin toplamini yazdiran program yaziniz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir sayi giriniz");
        int sayi= scan.nextInt();

        int birlerBasamagi=0;
        int sonBasamk=0;

        birlerBasamagi=sayi%10;
        sayi=sayi/1000;
        sonBasamk=sayi%10;

        System.out.println(birlerBasamagi+sonBasamk);

        //EX:Kullanicidan bir sayi alin ve sayinin rakamlarini birlr 10lar 100ler diye yazdirin

        int sy=scan.nextInt();

        int birler=sy%10;
        sy=sy/10;

        int onlar=sy%10;
        sy=sy/10;

        int yuzler=sy%10;
        sy=sy/10;

        System.out.println("birler = " + birler);
        System.out.println("onlar = " + onlar);
        System.out.println("yuzler = " + yuzler);
    }
}
