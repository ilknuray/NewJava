package day10StringManipulations;

public class ForLoop01 {
    public static void main(String[] args) {
        //ekrana bes kez hi yazdiriniz
        String hi = "hi";
        int sayac = 1;

        //1)Baslangic degeri 2)Hangi sartlar altinda calisacak 3)artiracak mi azaltacakmi

        for (sayac = 1; sayac <= 5; sayac++) {

            System.out.println(hi);
        }
        //EX:4ten 7 ye kadar tum tam sayilari ekrana yazan sayilari yaziniz

        for (int i = 4; i <= 7; i++) {
            System.out.println(i);

        }
        //ex:14 ten 5 e kadar olan sayilari ekrana yazdirin
        for (int i = 14; i >= 5; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //EX:14 ten 5 e kadar tum cift sayilari yaziniz
        for (int i = 14; i >= 5; i -= 2) {
            System.out.print(i + " ");

        }
        System.out.println();
        for (int i = 14; i >= 5; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        //ex:28 157 ARASI tek sayilari ekrana yazdirin
        System.out.println();
        for (int i = 28; i <= 157; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        //EX:"Java" stringini "J*A*V*A*"sekline ceviren kodu yaziniz
        //string index kullanir oda 0 dan baslar
        System.out.println();
        String str = "Java";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "*");

        }
        System.out.println();
        //EX:tekrarsizlari ekrana yazdiriiz
        String str1 = "Hellooo Ali";
        for (int i = 0; i < str1.length(); i++) {
            char karakter = str1.charAt(i);
            if (str1.indexOf(karakter) == str1.lastIndexOf(karakter)) {
                System.out.print(karakter);
            }

        }
    }
}
