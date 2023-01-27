package day15ArraysMultidimensionelArrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //binary search method=>bir elemanin Arrayde olup olmadigini anlariz
        int arr[]={12,31,43,14};
        int sayi=43;
        //bu methodu kullanmadan once sort() methodu kullanilmalidir.bu kullanilmazsa yanlis sonuc verebilir
        //aranilan element array icinde varsa o sayinin indexini dondurur
        //aranilan element array icinde yoksa -a seklinde bir deger dondurur ve olsaydi hangi sirada olur onu gosterir index e gore degil
        //binary search methodu tekrarlayan elemanlar icin kullanilmaz

        Arrays.sort(arr);//12,14;31,43
        int idx1=Arrays.binarySearch(arr,sayi);
        System.out.println("idx1 = " + idx1);

        int sayi2=58;
        int idx2=Arrays.binarySearch(arr,sayi2);
        System.out.println("idx2 = " + idx2);



    }
}
