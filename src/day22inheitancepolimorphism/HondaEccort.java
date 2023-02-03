package day22inheitancepolimorphism;

public class HondaEccort extends Honda {
    //constructor object olusturmayi saglar
        /*
        1)class olusturdugumuzda java otomatik olarak bir default costructor verir,cunku
        java classin bir kalip oldugunu ve object olusturmak icin yaratildigini ve object
        olusturmak icin constructorin sart oldugunu bilir
        2)Java nin otomatik olarak olusturdugu bu gorunmez constructor a "default cos denir
        3)kendimiz herhangi bir cons olusturdugumuzda java "default cons" u siler
        4)bir classta birden fazla constroctor olabilir ama parametreleri farkli olmalidir

         */
    public int price;
    public int year;

    public  String make;
    public String model;

    public HondaEccort() {

    }

    public HondaEccort(int price) {
        this.price = price;

    }


    public HondaEccort(int price, int year) {
        this.price=price;
        this.year=year;


    }
    public HondaEccort(int price,int year,String make,String model){
        this.price=price;
        this.year=year;
        this.make=make;
        this.model=model;


    }


}
