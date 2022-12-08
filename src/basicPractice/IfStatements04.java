package basicPractice;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
        /*
        kullanicidan bir gun alin
        gun cuma ise ekrana muslumanlar
        gun c.tesi ise yahudiler
        gun pazar ise hristiyanlar yazdirin
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen cuma c.tesi yada pazar gunlerinden birisini giriniz");
        String gun= sc.next();

        if (gun.equalsIgnoreCase("Cuma")){
            System.out.println("Muslumanlar");
        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("yahudiler");
        } else if (gun.equalsIgnoreCase("pazar")) {
            System.out.println("hristiyanlar");
        }else
            System.out.println("gecerli bir gun ismi giriniz");

    }
    //Stringlerde == yerine equals() kullanilir cunku javada 2 tane memory var String de referans degerine bakildigi icin equals() kullanilir
}

