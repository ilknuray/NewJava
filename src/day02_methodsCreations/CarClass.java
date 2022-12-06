package day02_methodsCreations;

public class CarClass {

    public String marka="Honda";
    public int fiyat=20000;
    public static void main(String[] args) {
// object nasil olusturulur
        CarClass carClass=new CarClass();
        System.out.println(carClass.fiyat);
        System.out.println(carClass.marka);
        carClass.dur();
        carClass.hareketEt();
    }


    public void hareketEt(){
        System.out.println("honda guzel hareket eder..");
    }
    public void dur(){
        System.out.println("Honda guvenli sekilde durur..");
    }


}
