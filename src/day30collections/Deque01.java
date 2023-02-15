package day30collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {
        /*
        double ended queue demaktir.yani iki uclu queue demektir

         */
        Deque<String>mobilyaKamyonu=new LinkedList<>();
        mobilyaKamyonu.add("yatak");
        mobilyaKamyonu.add("kanape");
        mobilyaKamyonu.add("ayna");
        mobilyaKamyonu.add("masa");
        mobilyaKamyonu.add("sandalye");
        mobilyaKamyonu.add("koltuk");
        System.out.println("mobilyaKamyonu = " + mobilyaKamyonu);
        //deque sadece linkedlistin constructorini kullanir


    }
}
