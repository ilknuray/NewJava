package day26exeptions;

public class Exception03 {
    public static void main(String[] args) {
        String str="123";
        System.out.println(karakterSayisi(str));

        String b=null;
        System.out.println(karakterSayisi(b));//NullPointerException++>null string ile length() kullanirsak

        String a="";
        System.out.println(karakterSayisi(a));//NumberFormatException==>String ifade yerine baska birsey kulanirsam

    }
    //stringdeki karakter sayisini bulunuz,int e ceviriniz,integeri karakter sayisina bolunuz

    public static double karakterSayisi(String str){
        int lenght=0;

        int s=0;

        double sonuc=0;

        try {
            lenght=str.length();
            s=Integer.valueOf(str);
            sonuc=s/lenght;
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

        return sonuc;

    }
}
