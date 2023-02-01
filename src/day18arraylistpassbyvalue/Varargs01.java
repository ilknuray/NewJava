package day18arraylistpassbyvalue;

public class Varargs01 {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println(add(2,3));
    }

    private static void topla( int a,int b) {

    }
    public static int add(int... a){
        int sum=0;
        for (int w:a) {
            sum+=w;

        }
        return sum;
    }
}
