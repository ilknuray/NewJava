package questions;

import java.util.Scanner;

public class IfStatementKanBagisi {
    public static void main(String[] args) {
        /*
        kullanicidan yasini kilosunu alalim
        18 yasindan kucuk ise kan bagisi yapamaz
        18yasindan buyuk ve 50 kilodan az ise kan bagisi yapamaz
        181 yasindan buyuk ve 50 kilodan agir ise kan bagislayabilir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        System.out.println("Lutfen kilonuzu giriniz");
        int kilo = scan.nextInt();

        if (yas < 0 && yas < 18) {
            System.out.println("kan bagisi yapamaz");
        } else if (yas >= 18) {
            if (kilo < 50) {
                System.out.println("kan bagisi yapamaz");
            } else if (yas > 18) {
                if (kilo >= 50) {
                    System.out.println("kan bagisi yapabilir");
                }

            } else {
                System.out.println("kilonuzu hatali girdiniz");
            }
        } else {
            System.out.println("hatali giris yaptiniz");
        }

    }
}