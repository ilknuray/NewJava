package day27exeptions;

public class Exceptions01 {
    public static void main(String[] args) {
/*
coding te her sart altinda yapilmasi gerekne seyler vardir.APP==>DB app ler database ler ile etkilesim halindedir.
AWS-->amazon web service database ile isim bitince connectioni kesmem gereklidir yoksa masraf cok olur

 */
        double sonuc = kacKati("Java", "xy");
        System.out.println(sonuc);
    }
    //Verilen iki stringten birinin karakter sayisinin digerinin kac kati olduhgunu veren method olusturunuz

    public static double kacKati(String s, String t) {
        double result=0;
        try {
            result=s.length() / t.length();
        }catch (NullPointerException e){
            System.out.println("length methodu null ile kullailamaz");

        }catch (ArithmeticException e){
            System.out.println("herhangi bir sayi sifir ile bolunemez");

        }finally {
            System.out.println("Dtabase ile connection kesildi");
        }
       return result;
    }
}
