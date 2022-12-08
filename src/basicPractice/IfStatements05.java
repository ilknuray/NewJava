package basicPractice;

import java.util.Scanner;

public class IfStatements05 {
    public static void main(String[] args) {
        /*
        Kullanicidan yasini isteyin 65 veya daha buyukse emekli olabilirsin
        65 ten kucukse emekli olamazsin ? daha calisman lazim
        yazdirin
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= sc.nextInt();

        int emeklilikYasi=65;

        if (yas>=65){
            System.out.println("Emkli olabilirsin");
        }else
            System.out.println("emekli olamazsin : "+(emeklilikYasi-yas)+" sene daha calismalisin");
    }
}
