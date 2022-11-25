package questions;

import java.util.Scanner;

public class IfStatementKoordinatNoktasi {
    public static void main(String[] args) {
        /*
        kullanicidan aldiginiz koordinat noktasinin
        hangi bolgede oldugunu yazdiran bir kod yaziniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen koordinatlariniz giriniz");
        int x= sc.nextInt();
        int y = sc.nextInt();

        if(x>0 && y>0){
            System.out.println("1. bolgedesiniz");
        }else if(x<0 && y>0){
            System.out.println("ikinci bolge");
        }else if(x<0 && y<0){
            System.out.println("ucuncu bolge");
        }else if(x<0 && y>0){
            System.out.println("dorduncu bolge");
        }else if(y==0 && x!=0){
            System.out.println("x ekseni uzerunde ");
        }else if(x==0 && y!=0){
            System.out.println("y ekseni uzerinde");
        }

    }
}
