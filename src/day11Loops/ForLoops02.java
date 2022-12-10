package day11Loops;

public class ForLoops02 {
    public static void main(String[] args) {
        //bir stringdeki "m" karakteri haric tum karakterleri yazdiriniz

        String str = "Andmmromedam";
        for (int i = 0; i < str.length(); i++) {
            if (str.contains("m")) {
                str = str.replaceAll("m", "");
            }

        }
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            char k = str.charAt(i);
            if (k == 'm') {
                continue;//bosver devam et onu atla demektir
            }
            System.out.print(k);
        }//Loopun icinde bazi degerler icin loopun calismamasini istersek continue kullaniriz
        //EX:1 den 100 e kadar tum sayilari ekrana yazdiriniz 6 ile bolunenler haric
        System.out.println();
        for (int i = 1; i < 101; i++) {
            if (i % 6 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        //EX:Size verilen bir stringteki 'm' den onceki karakterleri yazdiriniz
        System.out.println();
        String s = "Luxemburg";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'm') {
                break;
            }
            System.out.print(c);
        }
    }
}
