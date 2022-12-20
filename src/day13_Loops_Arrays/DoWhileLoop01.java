package day13_Loops_Arrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //EX:Kullanicidan bir sayi aliniz sayi 100 den kucuk ise ekrana Kazandin yaziniz
        //degilse Kaybettin yaziniz.Kullanici kazandikca oyun devam etmeli

        Scanner sc = new Scanner(System.in);
        int sayi=0;
        do {
            System.out.println("Lutfen bir sayi giriniz");
             sayi = sc.nextInt();

        if(sayi<100){
            System.out.println("Kazandiniz");
        }
    }
        while (sayi<100);

        System.out.println("Kaybettiniz");
}
   }