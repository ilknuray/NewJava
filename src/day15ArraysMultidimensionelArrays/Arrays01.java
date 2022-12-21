package day15ArraysMultidimensionelArrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //binary search method=>bir elemanin Arrayde olup olmadigini anlariz
        int arr[]={12,31,43,14};
        int sayi=43;
        //bumethodu kullanmadan once sort() methodu kullanilmalidir.bu kullanilmazsa yanlis sonuc verebilir

        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, sayi));


    }
}
