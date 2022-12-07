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
    }
    // equals charlar icin kullanilir
}
