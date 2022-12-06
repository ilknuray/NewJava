package day06nestedIfSwicht;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        //EX:kullanicidan yasini alip durumunu girin
        /*
        0 4 bbek
        5 12 Cocuk
        13 20 Genc
        21 30 yetiskin
        31 tanimlanmamis evre
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas<0){
            System.out.println("Gecerli bir yas araligi giriniz");
        } else if (yas<5) {
            System.out.println("Bebek");
        } else if (yas<13) {
            System.out.println("Cocuk");
        } else if (yas<31) {
            System.out.println("Genc");
        } else{
            System.out.println("Tanimlanmamis evre");

        }
    }
    //sinir deger analizi verilen sayilardan sinira en yakin ve degere en yakin ile test yapmak
}
