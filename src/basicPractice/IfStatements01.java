package basicPractice;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        /*
        kullanicidan alacaginiz iki sayiyi yine kullanicidan alacaginiz dort islemden biri ile isleme koyup sonucu yazdiriniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen birinci syiyi giriniz");
        int sayi1= sc.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2=sc.nextInt();

        System.out.println("Lutfen yaptirmak istediginiz islemi seciniz : 1)\ntoplama\n2)cikarma\3)carpma\n4)bolme");
        char islem=sc.next().charAt(0);

        if (islem=='1'){
            System.out.println(sayi1+sayi2);
        } else if (islem=='2') {
            System.out.println(sayi1-sayi2);
        } else if (islem=='3') {
            System.out.println(sayi1*sayi2);
        } else if (islem=='4') {
            System.out.println(sayi1/sayi2);
        }else {
            System.out.println("Lutfen gecerli bir islem seciniz");
        }
    }
}
