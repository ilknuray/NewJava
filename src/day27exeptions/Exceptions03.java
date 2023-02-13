package day27exeptions;

public class Exceptions03 {

    /*
    1)Java exceptionlar olusturarak devoloperlarin java kurallarina uymalarini temin etmistir
    2)Biz de app uretirken kendi exceptionlarimizi ureterek diger devoloperlarin bizim kurallarimiza uymalarini temin edebiliriz
    3)Java nin degil bizim urettigimiz exceptionlara "Custom exception"denir
    4)Custom exceptionlar da"RTE" yada "CTE" olabilir
    5)custom rte uretmek icin extedns rte deriz
    6)custom cte uretmek icin extends Exception deriz
    urettigim exceptionda eger message vermekistersem constructor olustururum ve super keywordu ile parents classa ulasirim



     */
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
