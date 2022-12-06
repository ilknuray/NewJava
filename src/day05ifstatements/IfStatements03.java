package day05ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //EX:kullanicidan gun isimlerini aliniz ve hafta icimi haftasoumu yazdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz");
        String gunIsmi = scan.next();
        if (gunIsmi.equalsIgnoreCase("Pazar")) {
            System.out.println("Haftasonu");

        } else if (gunIsmi.equalsIgnoreCase("C.tesi")) {
            System.out.println("Haftasonu");

        } else {
            System.out.println("Haftaici");
        }
        //equals() ==> iki stringi karsilastirmak icin kullanilir == isaretini kullanmamak gereklidir
       //equalsIgnorecase() ==> kullanmak mantiklidir buyuk kucuk harf farkini ortadan kaldirir


        //2.yol
        boolean haftasonu=(gunIsmi.equalsIgnoreCase("C.tesi")||(gunIsmi.equalsIgnoreCase("Pazar")));
        boolean haftaIc=(gunIsmi.equalsIgnoreCase("Parartesi")||
                gunIsmi.equalsIgnoreCase("Sali")||
                gunIsmi.equalsIgnoreCase("Carsamba")||
                gunIsmi.equalsIgnoreCase("Persembe")||
                gunIsmi.equalsIgnoreCase("Cuma"));
        if (haftasonu){
            System.out.println("Haftasonu");

        } else if (haftaIc) {
            System.out.println("Hafta ici");

        }else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }
    }
}
