package day06nestedIfSwicht;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        //kullaniciya ay ismi sorunuz ve kullanicinin verdigi ay isminden son aya kadar yaziniz
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen ay ismini giriniz");
        String ayIsmi=sc.next().toLowerCase();

        switch (ayIsmi){
            case "ocak":
                System.out.println("ocak");
            case "subat":
                System.out.println("subat");
            case "mart":
                System.out.println("mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayis":
                System.out.println("mayis");
            case "haziran":
                System.out.println("haziran");
            case "temmuz":
                System.out.println("temmuz");
            case "agustos":
                System.out.println("agustos");
            case "eylul":
                System.out.println("eylul");
            case "ekim":
                System.out.println("ekim");
            case "kasim":
                System.out.println("kasim");
            case "aralik":
                System.out.println("aralik");
                break;
            default:
                System.out.println("gecerli bir ay adi giriniz");
        }
    }
    //toLowerCase methodu tum harfleri kucuk harfe cevirir
    //toUpperCase methodu tum harfleri buyuk harfe cevirir


}
