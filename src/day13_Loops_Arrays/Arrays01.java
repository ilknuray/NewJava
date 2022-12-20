package day13_Loops_Arrays;

import java.util.Arrays;

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

    }
}
