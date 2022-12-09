package day09StringManipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        String str = "Java is easy";

        int strIndex = str.indexOf("a");//ilk gordugu a nin indexini verir
        System.out.println("strIndex = " + strIndex);

        //coklu karakter kullanirsak eger kelimenin ilk harfinin indexini bize veri

        //lastIndexOf verilen karakter yada karakterlerin en sonuncusunun indexini verir
        int last = str.lastIndexOf("a");
        System.out.println("last = " + last);

        //coklu karakterin gorundugu yerdeki kelimenin ilk indexini verir

        //EX:
        String s = "Mississippi";
        int i = s.indexOf("i");
        System.out.println("i = " + i);//indexof hem string hemde char ile kullanilabilir ancak charda tek karaktr olmalidir
        int ii = s.indexOf("iss");
        System.out.println("ii = " + ii);
        int iii = s.lastIndexOf("iss");

        //EX:bir stringteki bir karakterin tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz

        String str1 = "Helloooo";
        if (str1.indexOf('H') == str1.lastIndexOf('H')) {
            System.out.println("Tekrarsiz");
        } else
            System.out.println("Tekrarli");


        String tekrar = str1.indexOf('H') == str1.lastIndexOf('H') ? "Tekrarli" : "Tekrarasiz";
        System.out.println("tekrar = " + tekrar);


        int sonuc = str1.indexOf("o", 5);
        System.out.println("sonuc = " + sonuc);

        //indexof iki parametre ile kullanilirsa ikinci parametrede verilen sayi
        // kadar karakteri gectikten sonra istenen karakterin ilk gorunumunun indexini return eder

        String m="";
        System.out.println(m.isEmpty());

        //lenght()==0 demek isEmpty ile aynidir ama cok calistirir
        //index herzaman sifirdan baslar lenght ise 1 den baslar


        String s1="";
        System.out.println("Blankmi"+s1.isBlank());//hem bos string icin hemde space iceren stringler icin true verirken
        // isEmpty() hiclikte true verir space koyunca False verir

        //EX:Kullanicidan alinan isim mutlaka space den farkli en az bir karakter icermeliir

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= sc.nextLine();
         if (isim.isBlank()){
             System.out.println("Lutfen isminizi giriniz");
         }else
             System.out.println(isim);


    }
}
