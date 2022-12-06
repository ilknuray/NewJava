package day05ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //EX:kullanici gun numarasini girsin kod gun ismini yazsin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gunNo = scan.nextInt();

        if (gunNo == 1) {
            System.out.println("pazar");
        } else if (gunNo == 2) {
            System.out.println("p.tesi");
        } else if (gunNo == 3) {
            System.out.println("sali");
        } else if (gunNo == 4) {
            System.out.println("carsamba");
        } else if (gunNo == 5) {
            System.out.println("Persembe");
        } else if (gunNo == 6) {
            System.out.println("Cuma");
        } else if (gunNo == 7) {
            System.out.println("cumartesi");
        } else {
            System.out.println("Gecerli bir numara giriniz");
        }
    }
}
