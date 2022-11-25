package questions;

import java.util.Scanner;

public class SwitchCaseAyGunSayisi {
    public static void main(String[] args) {
        //girilen ay numarasina gore ayin  kac gun oldugunu yazdirin
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir ay  nosu giriniz");
        int ayNo = sc.nextInt();

        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girdiginiz ayda 31 gun vardir");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girdiginiz ayda 30 gun vardir");
                break;
            case  2 :
                System.out.println("lutfen yil giriniz");
                int yil= sc.nextInt();
                if(yil%4==0){
                    System.out.println("girdiginiz ayda 29 gun vardir");
                }else{
                    System.out.println("girdiginiz ayda 28 gun vardir");
                }break;
            default:
                System.out.println("lutfen gecerli bir numara giriniz");

        }
    }
}
