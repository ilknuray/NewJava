package day03dataCastingWrapperClass;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //Disaridaki datayi digital oratama tasiyan Classlardir.kullanicidan data almaya yarar
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("isim = " + isim);

        //Scanner constructor dur.scanner classindan object olusturulur neden system in yaziyorum cunku sistemin icine birsey yazacagim


    }
}
