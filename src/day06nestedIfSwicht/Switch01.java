package day06nestedIfSwicht;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //kullanicidan gun numarasini aliniz ve gun ismini ekrana yazdiriniz

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        byte gunNo= sc.nextByte();

        //if ile cozunuz

        if (gunNo==1){
            System.out.println("Pazar");
        } else if (gunNo==2) {
            System.out.println("Pztesi");
        } else if (gunNo==3) {
            System.out.println("Sali");
        } else if (gunNo==4) {
            System.out.println("carsmba");
        } else if (gunNo==5) {
            System.out.println("persembe");
        } else if (gunNo==6) {
            System.out.println("cuma");
        } else if (gunNo==7) {
            System.out.println("c;tesi");
        }else {
            System.out.println("Gecerli bir gun numarasi giriniz");
        }
        //swicth ile cozunuz

        switch (gunNo){
            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Sali");
                break;
            case 4:
                System.out.println("carsamba");
                break;
            case 5:
                System.out.println("Persembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Gecerli bir gun numarasi giriniz");
        }

    }
}
