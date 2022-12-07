package day06nestedIfSwicht;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazdiran hesap makinesi yapiniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yapmak istediginiz islemi giriniz , + ,-, *, / ,%");
        char islem=scan.next().charAt(0);
        System.out.println("ilk sayiyi giriniz");
        double S1=scan.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double s2=scan.nextDouble();

        switch (islem){
            case '+':
                System.out.println(s2+S1);
                break;
            case '-':
                System.out.println(s2-S1);
                break;
            case '*':
                System.out.println(s2*S1);
                break;
            case '/':
                System.out.println(s2/S1);
                break;
            case '%':
                System.out.println((s2*S1)/100);
                break;
            default:
                System.out.println("Gecerli bir islem seciniz");
        }
        //Switch sadece int,byte,short,char,String icin kullanilir
        //eger 3 ten fazla durum varsa switch tercih tercih edilir
    }
}
