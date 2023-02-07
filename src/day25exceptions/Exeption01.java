package day25exceptions;

public class Exeption01 {
    /*Beklenmeyen istisnai durumlarla karsilasilmasina exception denir
    Java da program calistirildiginda farkli sorunlar olabilir
    *programcinin kod hatasi
    *kullanicinin uygun girisler yapmmasi
    *internet baglantisinin kesilmesi
    java cozemzdigi sorunla karsilasinca calismayi durdurur ve exception atar
     */
    public static void main(String[] args) {
        divide(6, 2);
        divide(0, 2);
        divide(6, 0);//Matematikte bir sayi 0 ile bolunemez
        divide2(5, 0);
    }

    public static void divide(int a, int b) {
        //1.yol
        if (b == 0) {
            System.out.println("bir syai 0 ile bolunemez");
        } else {
            System.out.println(a / b);
        }

    }

    public static void divide2(int a, int b) {
        //2.yOL try catch ile exception u handle etmek gereklidir
        try {
            System.out.println(a/b);
            System.out.println("hi exception");
        } catch (ArithmeticException e) {
            System.out.println("Bolme isleminde bir problem olustu==>"+e.getMessage());
           e.printStackTrace();
           System.err.println("hatali bolme islemi");

        }
        //try kisminda duzeltmzmi yapiyorum,catch icine exceptionumu yaziyorum,catch odysi icine ise mesajimi yaziyorum
        /*
        java matematile ile ilgili karsilasilmasi beklenen tum hatalari ArimeticException classina koymustur.
        matematiktekitum hatalari bilmek zorunda degiliz.
         */

        /*
        1)exception kodlarimizi calistirirken meydana gelen beklemedik hatalardir
        2)Exceptionlar ile calismanin iki yolu vardir
        *try catch block kullanma
        **throw exceptin kullanarak calismayi durdurma
        3)exceptioni handle etmezszk java calismayi durdurur
        4)try-catch kullanirken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz
        5)try ,cacth ifadesi olmadan kullanilamaz CTE OLUR
        6)get.message tenik mesaj verir
        e.printStackTrace();==>hatayi detayli gosterir
        System.err.println=>renkli yazar
        7)try icinde ki kod atasiz calisirsa catch block devreye girmez

         */


    }

}
