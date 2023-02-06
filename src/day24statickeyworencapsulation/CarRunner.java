package day24statickeyworencapsulation;

public class CarRunner {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();
        System.out.println(car1.counter);
        System.out.println(car1.price);
        //static variable lar classa baglidir static olmayanlar ise objeye baglidir
        //yeni object olusturulunca hepsi 0lanir static olanlar haric
        //staticlerde yapilan degisiklik herseyi etkiler objede yapilan degisiklik saddece o objeyi etkiler
        System.out.println(car2.counter);
        System.out.println(car2.price);

        //her new keywordu bir object demektir

    }
}
