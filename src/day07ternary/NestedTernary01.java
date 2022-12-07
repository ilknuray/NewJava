package day07ternary;

public class NestedTernary01 {
    /*
    Verilen yilin "leap year" olup olmadigini kontrol eden java kodunu yaziniz
    i)yil 100 e bolunurse 400 e de bolunmelidir
    ii)yil 100 e bolunmezse 4 bolunmelidir
     */
    public static void main(String[] args) {
        int yil = 2021;

        String leapYear = yil % 100 == 0 ? (yil % 400 == 0 ? "artik yil" : "artik yil degil") : (yil % 4 == 0 ? "artik yil" : "artik yil degil");
        System.out.println("leapYear = " + leapYear);



        /*EX:asagidaki kurallara gore passwordun dogru olup olmadigini kontrol eden kodu yaziiz
        i)sekiz karakterden fazla veya sekiz karakter varda ilk harfi i olmalidir
        ii)sekiz karakterden az karakter varsa ilk harfi K olmalidir
         */

        String pass = "Kansjz";
        char ilkHarf = pass.charAt(0);

        String gecerliPass = pass.length() >= 8 ? (ilkHarf == 'i' ? "gecerli pass" : "gecersiz pass") : (ilkHarf == 'K' ? "gecerli pass" : "gecersiz pass");
        System.out.println("gecerliPass = " + gecerliPass);
    }
}
