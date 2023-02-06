package day24statickeyworencapsulation;

public class Car {
    public static String make="Honda";
    public  String moddel="Accord";
    public int price=20000;
    public static int counter=0;

    public Car(){
        counter++;
        price++;
    }
}
