package day15ArraysMultidimensionelArrays;

import java.util.Arrays;

public class MDSArrays02 {
    public static void main(String[] args) {
        //MDS kisa yoldan nasil olusturulur?
        char arr[][]={{'a','b'},{'C','D','E'},{'?'}};
        System.out.println(Arrays.deepToString(arr));

        //Bir string mds array icinde "a" olan elemanlari yazdiriniz
        String brr[][]={{"learn","java","it"},{"is","easy"}};
        for (String[] w:brr) {
            for (String k:w) {
                if (k.contains("a")){
                    System.out.println(k +" ");
                }
            }
        }
    }
}
