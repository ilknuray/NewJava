package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {

        //EX:[0,2,3,0,12,0] sifirlari sona koyunuz
        int arr[] = {0, 2, 3, 0, 12, 0};
        Arrays.sort(arr);
        int arr2[] = new int[arr.length];

        int idx = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] != 0) {
                arr2[idx] = arr[i];
                idx++;
            }
        }
        System.out.println("arr = " + Arrays.toString(arr2));


        //EX:Bir arrayin icinde herhengi bir elemanin olup olmadigini
        // ve kackez tekrarlandigini kontrol eden ve gosteren kodu yaziniz
        Scanner sc = new Scanner(System.in);

        int sayilar[] = {2, 1, 2, -3, 2};
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = sc.nextInt();
        int count = 0;
        for (int w : sayilar) {
            if (w == sayi) {
                count++;

            }
        }
        if (count > 0) {
            System.out.println(sayi + "arrayde " + count + "defa var");
        } else {
            System.out.println(sayi + "arrayde yok");


        }
        //EX:Size verilen bir cumledeki en uzun kelimeyi yazan kodu yaziniz
        //"Java ne kolaydir calisana,ne kolay ki zaten calismayana"

        String cumle = "Java ne kolaydir calisana, ne kolay ki zaten calismayana";
        cumle = cumle.replaceAll("\\p{Punct}", "");

        String kelime[]=cumle.split(" ");
        Arrays.sort(kelime, Comparator.comparingInt(String::length));//Lambda methodu ama cok iyi
        System.out.println(Arrays.toString(kelime));
        System.out.println(kelime[kelime.length - 1]);


    }
}