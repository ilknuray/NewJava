package day18arraylistpassbyvalue;

public class MethodOverLoading01 {
    public static void main(String[] args) {
        add(3,5);
        add(4.6,7);
        add(3,5,7);
        add(3,5.5);
//ayni isimli farkli parametreli methodlar uretmeye overloading denir.indexof() buna ornektir
        //1)Method isimleri ayni olmalidir
        //2)Parametreler arkli olmalidir
        //parametre sayisi yada data typleri degistirilebilir,parametrelerin yerleri degistirilerek yapilabilirler ancak data typelari farkli ise
        //3)Method ismi + parametre=method signature access modifierlari degistirsem bile hata verir java sadece method signatur e bakar.
    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void add(int a,double b){
        System.out.println(a+b);
    }
    public static void add(double a,int b){
        System.out.println(a+b);
    }
}
