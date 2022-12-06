import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //example1:sayilari kullanicidan alan ve toplama islemi yapan kodu yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2=scan.nextInt();

        int toplam=sayi1+sayi2;
        System.out.println("iki sayinin toplami : "+toplam);
    }
}
