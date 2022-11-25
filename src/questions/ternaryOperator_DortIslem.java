package questions;

import java.util.Scanner;

public class ternaryOperator_DortIslem {
    public static void main(String[] args) {
        /*
        kullanicidan alacaginiz iki sayiyi yine kullaniciya
        sectireceginiz dort islemden biri ile isleme koyup
        sonucunu yazdiriniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        double sayi2= scan.nextDouble();
        System.out.println("Toplama icin 1\ncikarma icin 2\ncarpma icin 3\nbolme icin 4\n rakamini tuslayiniz");
        System.out.println("Yapmak istediginiz islemin numarasini giriniz");
        int  islem= scan.nextInt();
         if (islem==1){
             System.out.println("Toplama : " +sayi1+"+"+sayi2 +" = "+(sayi2+sayi1));
         }else if (islem==2){
             System.out.println("Cikarma : "+sayi1+"+"+sayi2+"="+(sayi1-sayi2));
         }else if (islem==3){
             System.out.println("Carpma : "+sayi1+"*"+sayi2+"="+(sayi1*sayi2));
         }else if(islem==4){
             System.out.println("Bolme ; "+sayi1+"/"+sayi2+"="+(sayi1/sayi2));
         }else {
             System.out.println("Gecerli bir islem numarasi giriniz");
         }



    }
}
