package day27exeptions;

public class Exceptions03 {
    public static void main(String[] args) throws IllegalGradeException {

        IllegalGradeException ige = new IllegalGradeException("abc");
        notlariYazdir(50);
        ilkHarfBuyukOlmali("Ilknurr");
    }

    //ogrenci notlarini yazdiran bir method oluisturun
    public static void notlariYazdir(double not) throws IllegalGradeException {
        if (not < 0 || not > 100) {
            throw new IllegalGradeException("Not 0 dan kucuk 100 den buyuk olamaz");
        } else {
            System.out.println(not);
        }
    }
    //Verilen ismin ilk harfinin buyuk harf olmamasi durumunda exception atan kodu yaziniz

    public static boolean ilkHarfBuyukOlmali(String name){
        if (name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true;
        }else {
            throw new IllegalNameException("Isimler buyk harfle baslamalidir");
        }
    }
}
