package basicPractice;

import java.util.Scanner;

public class Scanner04 {
    //kullanicidan 5 basakli bir sayi alin ve ilk 2 ve son 2 rakaminin toplamini yazdirin
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bes basamakli bir sayi giriniz");
        int sayi= sc.nextInt();

        int birlerBasamagi=0;


        birlerBasamagi=sayi%10;
        birlerBasamagi++;
        sayi=sayi/10;

        System.out.println("sayi = " + sayi);

        birlerBasamagi=sayi%10;
        sayi=sayi/10;
        birlerBasamagi++;
        System.out.println("sayi = " + sayi);

        birlerBasamagi=sayi%10;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        sayi=sayi/10;
        birlerBasamagi++;

        birlerBasamagi=sayi%10;
        sayi=sayi/10;
        birlerBasamagi++;

        System.out.println("birlerBasamagi = " + birlerBasamagi);

    }
}