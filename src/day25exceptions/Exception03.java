package day25exceptions;

public class Exception03 {
    public static void main(String[] args) {
        String str="Ali";
        getNumsOfChars(str);
        String s="";
        getNumsOfChars(s);
        String t=null;
        //lenght te null atamasi varsa nullpointer exception i alioriz
        getNumsOfChars(t);

    }
    //bir stringde bulunan karakterlerin sayisini bulamabilmek icin bir method olsturunuz
    public static void getNumsOfChars(String str){
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("lenght methodunda hata olustu==> "+e.getMessage());
            e.printStackTrace();
        }

    }
}
