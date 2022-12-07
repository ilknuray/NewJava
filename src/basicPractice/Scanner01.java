package basicPractice;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //ucgenin cevresi
        Scanner scan=new Scanner(System.in);
        byte a=scan.nextByte();
        byte b=scan.nextByte();
        byte c=scan.nextByte();

        int cevre=a+b+c;
        System.out.println("cevre = " + cevre);

        /*EX:   A
               A A
              A A A
         */
        System.out.println("kullanicidan alacaginiz karakter ile yukaridaki sekli yazdiriniz");

        char harf=scan.next().charAt(0);

        System.out.println("  "+harf+"  "+"\n "+harf+" "+harf+" \n"+harf+" "+harf+" "+harf);

    }
}
