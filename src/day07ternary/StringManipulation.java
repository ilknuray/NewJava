package day07ternary;

public class StringManipulation {
    public static void main(String[] args) {
        //String class methodlari
        /*
        1)equals()==>iki stringin ayni olup olmadigini anlamamiza yarar
                     boolean return eder
        2)equalsIgnoreCase()==>iki stringin ayni olup olmadigini buyuk kucuk harfe bakmadan esit mi degil mi diye bakar
                     boolean retun eder
        3)toLowerCase==>Bir stringteki tum harfleri kucuk harfe cevirir
                     String return eder
        4)toUpperCase==>bir stringteki tum harfleri buyuk harf yapmak icin kullanilir
                     String return eder
        5)charAt()==>Bir stringten belli bir indexteki karakteri almak icin kullanilir
                     char return eder
        6)lenght()==>Bir strigte kac tane karakter kullanildigini gormrk icin kullanilir
                     int return eder
        7)contains()==>Bir stringte belli bir karater veya karakterlrin var olup olmadigini anlamak icin kullanilir
                     boolean return eder
        8)split()==>Bir stringi istedigimiz karakterden parcalamaya yarar
                    Array return eder (Split te kullandigimiz karakter yok olur)
         */

        /*EX:bir passwordun gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz
        en az sekiz karakter
        space olmayacak
        ilkharf buyuk olmali
        son karakter soru isareti olmali
         */

        String pass="Manisa12?";
        if((pass.length()>7) && (!pass.contains(" "))&&(pass.charAt(0)=='M'||pass.charAt(0)=='m')&&(pass.charAt(pass.length()-1)=='?')){
            System.out.println("gecerli sifre");
        }else{
            System.out.println("gecersiz sifre");
        }

    }
}
