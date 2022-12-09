package day08StringManipulation;

public class StringManipulation02 {
    public static void main(String[] args) {
        //bir stringteki space haric kac tane karakter kullanildigini gosteren kodu yazdirin

        String str = "Ali okula gitti";

        str = str.replace(" ", "");
        System.out.println(str.length());
        //replace() bir stringdeki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir

        //EX:Bir stringteki tum a leri buyuk aya ceviriniz

        String str2 = "Ankara nin tasina bak gozlerimin yasina bak";
        str2 = str2.replace("a", "A");
        System.out.println(str2);

        //EX:Bir stringteki kara kelimesinin yerine * koyunuz

        String str3 = "Kara kara dusunme Ankara";
        str3 = str3.toLowerCase().replace("kara", "*");
        System.out.println(str3);

        //EX:Bir stringteki tum sayilari * ceviriniz

        String id = "10123095630TR";
        id = id.replaceAll("\\d", "*");
        System.out.println(id);

        /*
        Bir grup data yi ifade eden kodlara regex denir ==>regular expressions
        1)tum rakamlar [0-9] ==> hari dersem [^0-9]
        2)tum kucuk harfler [a-z]
        3)tum buyuk harfler [A-Z]
        4)tum harfler [a-zA-Z]
        5)Sesli harfler [aeiouAEUIO]
        6)space [ ]
        7)tum rakamlar tum harfler [0-9a-zA-Z]
        8)tum noktalama isaretleri \\p{Punct}

         */

        //EX:Verilen bir stringte kullanilan noktalama isareti rakamlar ve space haric tum kalanlari, sayisini bulunuz

        String str4 = "Ali 13 yasinda, dersem inanma!...";
        str4 = str4.replaceAll("[0-9]", "").
                replace(" ", "").
                replaceAll("\\p{Punct}", "");
        System.out.println(str4.length());

        str4=str.replaceAll("\\w","");
        System.out.println("str4 = " + str4.length());


    }
}
