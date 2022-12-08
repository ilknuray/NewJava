package basicPractice;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        /*
        bir iscinin isi kac gunde bitirdigini ve toplam isci sayisini alarak isin bitme suresini hesaplayan bir kod yaziniz

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir isci isi kac gunde bitirmektedir");
        double isBitirmeSuresi= sc.nextDouble();
        System.out.println("Toplam kac isci birlikte calisiyor");
        double isciSayisi= sc.nextInt();

        double birlikteBitirmeSuresi=isBitirmeSuresi/isciSayisi;
        System.out.println("birlikteBitirmeSuresi = " + birlikteBitirmeSuresi);


    }
}
