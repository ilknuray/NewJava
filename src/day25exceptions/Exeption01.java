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
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {

        }

    }

}
