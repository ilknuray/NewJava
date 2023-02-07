package day26exeptions;

public class Exceptions01 {
    public static void main(String[] args) {

        //Stringi intiger a ceviren bir method yaziniz ve hata ousursa handle ediniz
        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5);

        String st = "1a3";
        int sonuc = convertStringToInteger(st);
        System.out.println(sonuc+10);

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
