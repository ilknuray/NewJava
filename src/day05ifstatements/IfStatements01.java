package day05ifstatements;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        //EX:kullanicidan alina sayinin tek mi cift mi oldugunu giriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%2==0){
            System.out.println("Cift sayi");
        }else {
            System.out.println("Tek sayi");
        }


        //EX:Bir sayinin negatif pozitif veya notr oldugunu soyleyen kodu yaziniz
        System.out.println("bir sayi giriniz");
        int sayi2=scan.nextInt();
        if(sayi2>0){
            System.out.println("Sayi pozitif");
        } else if (sayi2==0) {
            System.out.println("Notr");
        }else {
            System.out.println("Negatif sayi");
        }
    }

}
