package day18arraylistpassbyvalue;

public class MethodOverLoading01 {
    public static void main(String[] args) {
        add(3,5);
        add(4.6,7);
        add(3,5,7);
        add(3,5.5);

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
