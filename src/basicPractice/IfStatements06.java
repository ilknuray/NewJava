package basicPractice;

import java.util.Scanner;

public class IfStatements06 {
    public static void main(String[] args) {
        /*
        maas teklifi 20bin ustu kabul
        10 20 arasi dusunecegim
        10 altinda kabul edemem
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen maas teklifinizi giriniz");
        double maas= sc.nextDouble();

        if (maas<=0){
            System.out.println("Yanlis giris yaptiniz");
        }if(maas>=20000){
            System.out.println("kabul");
        } else if (maas>10000 && maas<20000) {
            System.out.println("dusunecegim");
        }else if (maas<10000){
            System.out.println("Kabul edemem");
        }else
            System.out.println("lutfen gecerli bir teklifte bulunuz");
    }
}
