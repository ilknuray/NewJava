package day08StringManipulation;

import java.util.Scanner;

public class StringManipulation03 {
    public static void main(String[] args) {
        /*EX:bir pass in gecrliolmadigini asagidaki kurallara gore test eden kodu yaziniz
        space haric en az 8 karakter olmali
        en az bir sembol icermeli
        en az bir rakam icermli
        en az bir harf icermeli
        en az bir kucuk harf icermeli
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz");
        String pass = sc.nextLine();

        //EX:bir string teki noktalma isaretleri haric karakter sayisini gosteren kodu yaziniz

        String cumle = "sen yapmazsan, ben yapmazsam, o yapmazsa kim yapacak?";
        cumle = cumle.replaceAll("[^\\p{Punct}]", "");
        System.out.println(cumle.length());

        cumle = cumle.replaceAll("\\W", "") + cumle.replace(" ", "");
        System.out.println("cumle = " + cumle.length());

        //EX:Verilen bir string al ile basliyor ve x ile bitiyorsa ekrana harika
        // yazdirin aksi halde normal yazdirin

        String str="Alem";
        if (str.startsWith("Al")&&str.endsWith("x")){
            System.out.println("Harika");
        }else
            System.out.println("Normal");

    }
}
