package basicPractice;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        /*
        not karsiligi harf degerlerini ve aciklamasini giriniz
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= sc.nextDouble();
        if(not<100 && not>90){
            System.out.println("A Cok iyi");
        } else if (not<=89 && not>80) {
            System.out.println("B Iyi");
        } else if (not<=79 && not>70) {
            System.out.println("C Orta");
        } else if (not<=69 && not>60) {
            System.out.println("D Gecer");
        } else if (not<=59 && not>0) {
            System.out.println("F Zayif");
        }else
            System.out.println("Gecerli bit not giriniz");
    }
}
