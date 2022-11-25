package questions;

import java.util.Scanner;

public class SwitchCase100gunSonraHangiGun {
    public static void main(String[] args) {
        /*
        Kullanicini yasadigi gune gore 100 gun sonra hangi gun oldugunu yazdiriniz
        pazartesi haftanin baslangici
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen pazartesi : 1\nsali : 2\ncarsamba : 3\npersembe : 4\ncuma : 5\nc.tesi : 6\npazar : 7\n giriniz :");
        int kacinciGun=sc.nextInt();
        System.out.println("gitmek istediginiz gun sayisini yaziniz :");
        int kacGunSonra= sc.nextInt();
        int bulunanGun=(kacGunSonra+kacinciGun)%7;

        if(kacinciGun<=0 && kacinciGun>=7) {
            System.out.println("hatali veri girisi");
        }else
            System.out.println("kacinci gunu ogrenmk istiyorsunuz : ");

            switch (bulunanGun) {
                case 1:
                    System.out.println(kacGunSonra + "pazartesi");
                    break;
                case 2:
                    System.out.println(kacGunSonra + "sali");
                    break;
                case 3:
                    System.out.println(kacGunSonra + "carsamba");
                    break;
                case 4:
                    System.out.println(kacGunSonra + "persembe");
                    break;
                case 5:
                    System.out.println(kacGunSonra + "cuma");
                    break;
                case 6:
                    System.out.println(kacGunSonra + "cumartesi");
                    break;
                case 0:
                    System.out.println(kacGunSonra + "pazar");
                    break;
                default:
                    System.out.println("gecerli bir numara giriniz");

            }


        }

    }
