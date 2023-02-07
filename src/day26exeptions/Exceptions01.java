package day26exeptions;

public class Exceptions01 {
    public static void main(String[] args) {
        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5);

        String st = "1a3";
        int sonuc = convertStringToInteger(st);
        System.out.println(sonuc);

    }

    public static int convertStringToInteger(String str) {
        int i=0;
        try {
            i= Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.out.println("rakam yazmalisin");
        }


        return i;
    }
}
