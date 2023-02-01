package day17arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {


        //EX1:Verilen bir listteki elemanlari tekrarsiz olarak yaziniz
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(2);
        sayilar.add(5);

        List<Integer> yeniSayilar = new ArrayList<>();

        for (Integer w : sayilar) {
            if (!yeniSayilar.contains(w)) {
                yeniSayilar.add(w);
            }
        }
        System.out.println(yeniSayilar);

        ///EX2:Kullanicidan bir harf aliniz harf sizdeki listin icinde varsa o harfi bulundu ya ceviriniz yoksa o harfi liste ekleyiniz

        Scanner scan = new Scanner(System.in);
        String girilenHarf = "";
        List<String> harf = new ArrayList<>();
        harf.add("A");
        harf.add("K");
        harf.add("R");
        harf.add("S");
        do {


            System.out.println("Lutfen bir harf giriniz");
            girilenHarf = scan.next().substring(0, 1);


            if (harf.contains(girilenHarf)) {
                harf.set(harf.indexOf(girilenHarf), "Bulundu");
            } else if (!girilenHarf.equals("Q")){
                harf.add(girilenHarf);
            }


        } while (!girilenHarf.equals("Q"));
        System.out.println(harf);


    }
}