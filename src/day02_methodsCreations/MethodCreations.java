package day02_methodsCreations;

public class MethodCreations {


    /*
                   Primitive ve non primitive arasindaki farklar

        1)non primitive data tiplerinde degerin yaninda methodlar vardir
        Primitive data tiplerinde ise sadece deger vardir method yoktur

        2)Primitive data tipleri java tarafindan olusturulmustur
        Non primitive data tiplerini ise  java da olusturmustur bizde olusturabiliriz her developer uretebilir
        sayisi sinirli degildir

        3)Primitive isimleri kucuk harfle baslar
        Non primitiveler buyuk harfle baslar

        4)Primitive ler memoryde farkli buyuklukte yer kullanir
        non primitivelerin hepsi memoryde ayni buyuklukte yer kaplar

     */
    public static void main(String[] args) {

        //void gordugumuzde bu methodun bir sey uretmedigini dusunecegiz
        //ornegin ekrana bir sey yazdirmak ve bir butona click yatptiran method gibi

        //main method icerisinde kullanilan hersey static olmalidir
        System.out.println(toplamaYap(1.2, 5));
        System.out.println(ucSayiyiCarp(2, 4, 8));
        System.out.println(ikiSayiyiToplaUcuncuIleCarp(4,5,6));

    }

    //Ex:Toplama islemi yaptiran bir method olusturalim
    //methodla acction oldugu icin ismide bir action icermelidir
    public static double toplamaYap(double a, double b) {


        return a + b;


    }

    //ex2:3 sayiyi birbiri ile carpan bir method olusturun
    public static int ucSayiyiCarp(int a, int b, int c) {
        return a * b * c;
    }
    public static int ikiSayiyiToplaUcuncuIleCarp(int a,int b,int c){
        return (a+b)*c;
    }

}
