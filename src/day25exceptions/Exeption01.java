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
        divide(6,2);
        divide(0,2);
        divide(6,0);
    }
        public static void divide(int a,int b){
            System.out.println(a/b);
        }

}
