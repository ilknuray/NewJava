package day32maps;

;

public class StaticBlocks01 {
    public static double pi;
    static {
        System.out.println("static block2");
    }

    static {
        pi=3.14;
        /*
        Statik blocklar ihtiyacimiz olan variablelain class olusturma safhasinda elimizde olmasini saglar
        statik blocklar class icindeki herseyden once calistirilirlar
        static blocklaricerisinde sadece static variablelara deger atanabilir.
        Birden fazla static block varsa once yazilan ilk calisir
         */
        System.out.println("Static block1");
    }

    public static void main(String[] args) {
        System.out.println("main method");


    }
}
