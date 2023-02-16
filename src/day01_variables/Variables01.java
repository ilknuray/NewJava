package day01_variables;

public class Variables01 {
    public static void main(String[] args) {


        //variable nasil olusturulur
        //1)access modifier  2)Data type 3)Variable ismi 4)= 5)Deger 6);
        int age = 13;

        int height = 172;

        //"=" assignment operator dur sagdaki degeri alip soldaki variable in icine atar

    /*
    Javada data type ler

    1)int tam sayilari alir 32bit kullanir
    2)short tam sayilar 16 bit kullanir
    3)long tam sayilar 64 bit kullanir int in yetmedigi yerde long kullaniriz
    4)double ondalikli sayilar virgul sonrasi 16 basamak hassas bilimsel veriler 64 bit kullanir
    5)float ondlalikli sayilar virgul sonrasi 7 basamak fiyatlandirmalar icin sonuna kucuk yada buyuk f konulur
    6)byte tam sayilar 128 -127 arasi 8bit kullanir
    7)boolean true,false
    8)char tek karakter

    Hafizayi akillica kullanabilmek icin 4 farkli tam sayi data tipi uretilmistir

     */

        float priceOfShirt = 10.56f;
        double weightOfCell = 0.0000004;
        //siz long demenize ragmen java verilen sayiyi int kabul eder ve memory i korumak icin uyari verir
        long populationOfWorld = 70000000000L;
        //bu yuzden long bir variable a int araligi disinda bir sayi verirsek sonuna L koyariz
        long x = 11234L;
        //sayilar int araligina denk geliyorsa eger sorun cikarmaz ancak biz long datatype ni kullandigimizda sonuna l koyariz

        // Numeric data tipleri=byte<short<int<long<float<double
        //numeric olmayan data turleri=boolean,char



        //non primitive data type;bu data type lar icinde methodlar barindirir

        String name = "Tom Hanks".toUpperCase();
        System.out.println(name);
        System.out.println(name.length());


    }
}