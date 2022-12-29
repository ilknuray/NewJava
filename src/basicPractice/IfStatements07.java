package basicPractice;

import java.util.Scanner;

public class IfStatements07 {
    public static void main(String[] args) {
        //kullanicidan iki sayi alin buyuk olani yazdirin

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1 = sc.nextInt();
        int sayi2 = sc.nextInt();

        if (sayi2 > sayi1) {

            System.out.println(sayi2);
        }else
            System.out.println(sayi1);


        Object buyukSayi=sayi1==sayi2 ? "Sayilar esit" :(sayi1>sayi2 ?sayi1:sayi2);
        System.out.println("buyukSayi = " + buyukSayi);

    }
}