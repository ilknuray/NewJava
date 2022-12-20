package day13_Loops_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        Ayni data tipinde coklu datayi depolamak icin Java nin olusturdugu yapilar vardir
        bu yapilardan biriside arrays lerdir
         */

        int sayilar[]=new int[7];//array olusturma
        System.out.println(Arrays.toString(sayilar));//Arraysi yazdirmak icin bu sekilde yapmaliyim
        //Array olusturdugumuzda icine kac tane koyaczgimizi belirtmemiz gerekli.
        //
       sayilar[1]=11;
       System.out.println(Arrays.toString(sayilar));
       sayilar[0]=12;
       sayilar[2]=13;
       sayilar[3]=14;
       sayilar[4]=15;
       sayilar[5]=12;
       sayilar[6]=16;
        System.out.println(Arrays.toString(sayilar));

        //Arraydaki herhangi bir elemani nasil yazdiririm
        System.out.println(sayilar[3]);
        //Arraydeki en kucuk ve en buyuk elemani yazdiriniz

        Arrays.sort(sayilar);//sort methodu array elemanlarini kucukten buyuge dizer
        int ilk=sayilar[0];

        int son=sayilar[sayilar.length-1];//lenght arraylerde parantezli kullanilmaz cunku method degildir burada

        System.out.println(ilk+son);

        //EX:Sayilar arrayinin icindeki tum elemanlarin toplamini ekrana yazdiran kodu yazdirin
        int sum=0;
        for (int w:sayilar) {
            sum+=w;

        }

        System.out.println("sum :"+sum);
        System.out.println(Arrays.stream(sayilar).sum());

    }
}
