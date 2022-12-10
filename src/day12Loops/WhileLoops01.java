package day12Loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
        //3 ten 8 e kadar olan sayilari ayni satirda ekrana yazdiran kodu yaziniz
        for (int i = 3; i < 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int sayi = 3;
        while (sayi < 9) {
            System.out.print(sayi + " ");
            sayi++;
        }
        System.out.println();
        //EX:17 den 4 e kadar olan tum cift sayilari ekrana yazdiran kodu yaziniz
        int sayi2 = 17;
        while (sayi2 > 3) {
            if (sayi2 % 2 == 0) {
                System.out.print(sayi2 + " ");
            }
            sayi2--;
        }
        //EX:12 den 67 ye kadar olan sayilarin toplmini veren kodu yaziniz
        System.out.println();
        int top = 0;
        int a=12;
        while (a<67){
            top+=a;
            a++;
        }System.out.println(top);
        //EX:size verilen bir sayinin rakamlari toplamini ekrana yazdiran kodu yaziniz
        int sayi3=132;
        int rakamlarTop=0;

        while (sayi3>0){
            rakamlarTop+=sayi3%10;
            sayi3/=10;

        }
        System.out.println("rakamlar toplami = "+rakamlarTop);

        //EX:Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int rakam=sc.nextInt();
        int n=1;
        while (n<11){
            System.out.println(rakam+"x"+n+" = "+rakam*n);
            n++;
            }
        for (int i = 1; i <=rakam ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.println("carpim tablosu : "+i*j);

            }

        }
        }

    }

