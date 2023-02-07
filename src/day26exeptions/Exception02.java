package day26exeptions;

public class Exception02 {
    public static void main(String[] args) {
        String str="Java";
        System.out.println(getCharFromString(str, 2));
        System.out.println(getCharFromString(str, 6));//StringIndexOutOfBoundsException==>Bir stringde var olmayan index i kullandigimizda aldigimiz hatadir

    }
    //bir stringin istedigimiz ir karakterini bize veren method
    public static char getCharFromString(String str,int idx){
        int i=0;
        try {
            i=str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Stringin indexi asildi");

        }
      return (char) i;
    }
}
