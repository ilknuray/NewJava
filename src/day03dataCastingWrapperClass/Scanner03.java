package day03dataCastingWrapperClass;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //example:kullanicidan kenar uzunluklarini alip dikdortgenin alan ve cevresini hesaplayiniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen diktortgenin kisa kenarini giriniz");
        int kkenar= scan.nextInt();;
        System.out.println("lutfen uzun kenarini giriniz");
        int uKenar= scan.nextInt();

        int alan=kkenar*uKenar;
        int cevre=2*(kkenar+uKenar);

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

    }
}
