package basicPractice;

import java.util.Scanner;

public class IfStatements09 {
    public static void main(String[] args) {
        //kullanicidan dortgenin kenar uzunluklarini isteyip kare olup olmadigini yazdirin
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen dortgenin kenar uzunluklarini giriniz");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a == b && b == c && c == d) {
            System.out.println("bu bir karedir");
        } else System.out.println("Kare degildir");
    }
}
