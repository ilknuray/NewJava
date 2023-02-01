package day17arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //EX:Bir listteki elemanlardan birbirine en yakin olanlari bulinuz
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(12);
        sayilar.add(19);
        sayilar.add(15);
        sayilar.add(30);
        sayilar.add(21);
        System.out.println("sayilar ilk hali = " + sayilar);
        Collections.sort(sayilar);//listlerde sort yapmak icin collections.sort yapmaliyiz;arrayde ise arryismi.sort yeterlidir

        System.out.println("sayilar = " + sayilar);

        int minFark=Integer.MAX_VALUE;
        for (int i = 1; i <sayilar.size(); i++) {
            minFark=Math.min(minFark, sayilar.get(i)- sayilar.get(i-1));


        }


    }
}
