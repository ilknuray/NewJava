package day06nestedIfSwicht;

import java.util.Scanner;

public class NestedIf01 {
    /*
    Passwordn ilk harfi buyuk a ise 'A' ise gecerli password aksi halde gecersiz password
    ilk harfi kucuk harf ise 'z' olursa gecerli pass aksi halde gecersiz pass
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz");
        String pass= scan.next();
         if (pass.charAt(0)>='A' && pass.charAt(0)<='Z'){
             if (pass.charAt(0)=='A'){
                 System.out.println("Gecerli password");
             }else {
                 System.out.println("Gecersiz password");
             }
         } else if (pass.charAt(0)>='a' && pass.charAt(0)<='z') {
             if (pass.charAt(0)=='z'){
                 System.out.println("Gecerli pass");
             }else {
                 System.out.println("gecersiz pass");
             }
         }else {
             System.out.println("Gecerli bir password giriniz");
         }

         //2.YOL
        char ilkHarf=pass.charAt(0);










             /*
    Passwordn ilk harfi buyuk a ise 'A' ise gecerli password aksi halde gecersiz password
    ilk harfi kucuk harf ise 'z' olursa gecerli pass aksi halde gecersiz pass
     */


        Scanner scann=new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        char ilkHarfi=scann.next().charAt(0);
        if (ilkHarfi=='A'||ilkHarfi=='z'){
            System.out.println("gecerli sifre");
        }


    }
    // equals charlar icin kullanilmaz sadece String icin gecerlidir
    //nested if kabul edilmez mumkunse kullanmamaliyiz cunku cok fazla zaman harcanir buna "TIME COMPLEXITY3 DENIR MUMKUNSE KULLANMAMALIYIZ

}
