package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {


        //EX1:Verilen bir listteki elemanlari tekrarsiz olarak yaziniz
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(2);
        sayilar.add(5);

        List<Integer>yeniSayilar=new ArrayList<>();

        for (Integer w:sayilar) {
            if (!yeniSayilar.contains(w)){
                yeniSayilar.add(w);
            }
        }
        System.out.println(yeniSayilar);


    }
}