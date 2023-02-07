package day26exeptions;

public class Exception02 {
    public static void main(String[] args) {
        String str="Java";
        System.out.println(getCharFromString(str, 2));
        System.out.println(getCharFromString(str, 6));//StringIndexOutOfBoundsException==>Bir stringde var olmayan index i kullandigimizda aldigimiz hatadir

    }
    //bir stringin istedigimiz bir karakterini bize veren method
    public static char getCharFromString(String str,int idx){
        char i=' ';
        try {
            i=str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Stringin indexi asildi");

        }
      return i;
    }
}
