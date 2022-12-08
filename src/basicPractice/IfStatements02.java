package basicPractice;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        /*
        KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri ekranda yazdiran kodu yaziniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen Y yada N harflerinden birisini giriniz");
        char karakter=sc.next().charAt(0);

        if (karakter=='Y'){
            System.out.println("Yes");
        }else {
            System.out.println("Non");
        }
    }
}
