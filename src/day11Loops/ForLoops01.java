package day11Loops;

import java.util.Scanner;

public class ForLoops01 {
    public static void main(String[] args) {
        //EX:3 ten 6 ya kadar olan tam syilarin toplamini bulan kodu yaziniz

        int top=0;
        for (int i = 3; i <7 ; i++) {
            top+=i;
        }
        System.out.println("Toplam : "+top);
       // 6 dan 3 kadar olan sayilarin carpimini yaeiniz
        int carpma=1;
        for (int i = 6; i >2 ; i--) {
            carpma*=i;
        }
        System.out.println("carpim : "+carpma);

        //EX:verilen sayinin rakamlari toplamini bulunuz
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= sc.nextInt();
        int rakamlarTop=0;
        //negatif sayilarla calismak istersem
        Math.abs(sayi);//Kullanirsam mutlak deger alarak pozitife cevirir

        for (int i =sayi; i >0 ;i/=10 ) {
            rakamlarTop+=i%10;
        }
        System.out.println(rakamlarTop);

        //EX:Size verilen bir stringi ters ceviren kodu yaziniz

        String isim= "ilknur";
        //concatination yapilacaksa bos string koymaliyiz
        String ters="";
        for (int i = isim.length()-1; i >-1 ; i--) {
            char k=isim.charAt(i);
            ters+=k;

        }
        System.out.println(ters);
    }
}
