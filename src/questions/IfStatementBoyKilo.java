package questions;

import java.util.Scanner;

public class IfStatementBoyKilo {
    public static void main(String[] args) {
        /*
        kullanicidan boyunu cm kilosunu cm olarak isteyiniz
        bmi=kilo/boy*boy(cm)
        bmi<=20 ise zayifsiniz
        20<bmi<25 normal sinirdasiniz
        25<bmi<25 sisman kategorisindesinz
        30<bmi obezsiniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen boyunuzu cm olarak giriniz");
        double boy= sc.nextDouble();
        System.out.println("lutfen kilonuzu kg olarak giriniz");
        double kilo= sc.nextDouble();
        double bmi=kilo/((boy/100)*(boy/100));

        if (bmi<=20){
            System.out.println("zayif");
        }else if (bmi>20 && bmi<=25){
            System.out.println("normal");
        }else if (bmi>25 && bmi<30){
            System.out.println("sisman");
        }else if (bmi>30){
            System.out.println("obez");
        }else {
            System.out.println("boy ve kilo ddegerlerinizi dogru birimlrde giriniz");
        }
    }
}
