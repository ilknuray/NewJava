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

        int i=0;
        int top=0;

        while (i<sayilar.length){
           top+=sayilar[i];
            i++;
        }
        do {
            //top+=sayilar[i];
            i++;

        }while (i<sayilar.length);
        System.out.println("top = " + top);

        //for each loop Array ve Collectionlarda kullanilir
        //once data tipi yazilir daha sonra variable ismi daha sonra da arrayin ismi yazilir

         //EX:String bir array olusturunuz bu arraye 5 isim yerlestiriniz bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz
        String names[]=new String[5];
        names[0]="Ali";
        names[1]="Tom";
        names[2]="Veli";
        names[3]="Kemal";
        names[4]="Cem";

        int karakterTop=0;
        for (String w:names) {
            karakterTop+=w.length();
        }
        System.out.println("karakterTop = " + karakterTop);

    }
}
