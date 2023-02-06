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
        //static variablelara objectleri kullanarak ulasmak mumkun ama tavsiye edilmez
        //static variable lara class ismi kullanarak ulasilmalidir
        //
        /*
       Static keyword nedir?
        1)CLASSA baglanmis class elemanlaridir
        2)butun objectlerin ortak elemanidir
        3)staticler uzerinde yapilan butun degisiklikleri objectler gorur ve etkilenir
        4)Static class elemanlarina class uzerinden ulasilir

         */

    }
}
