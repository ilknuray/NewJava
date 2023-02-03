package day22inheitancepolimorphism;

public class Car extends Vehicule{
    public String color;
    public int km;

    public Car(){

    }
    public Car(String color,int km){
        super("Car");
        this.color=color;
        this.km=km;
        System.out.println("car costructor");

    }
}
