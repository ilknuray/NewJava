package day18arraylistpassbyvalue;

public class PostPreIncrementDecrement {
    public static void main(String[] args) {
        int a=5;
        //post increment
        int b=a++;//B = 5 olur A ise =6 olur
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        //Java anlamli bir cumle duydugunda hemmen uygular java hemen okur uygular ayi once b yapar sonra artirir.

        //pre increment
        int c=++a;
        System.out.println("c = " + c);
        System.out.println("a2 = " + a);
    }
}
