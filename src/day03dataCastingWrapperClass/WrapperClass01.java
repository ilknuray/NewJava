package day03dataCastingWrapperClass;

public class WrapperClass01 {
    public static void main(String[] args) {
        /*
        primitive lerde sadece deger olur
        non-primitive lerde ise degerler ve kullanisli methodlar vardir
        Primitive lerin icinde de method olusturmak istendigi icin wrapper class olusturulmustur
              Primitive+Method=Wrapper Class


              Primitive         Wrapper
                 byte            Byte
                 short           Short
                 int             Integer
                 long            Long
                 float           Float
                 double          Double
                 boolean         Boolean
                 char            Character
       Class isimleri buyuk harfle baslar ayrica non primitive lerde buyuk harfle baslar
       wrapper classlar non-primitive dir
         */

        byte primitive = 12;//burada his method yoktur


        Byte wrapperByte = 12;//variable ismini yazip nokta koydugumuzda bir cok method goruruz


        //byte data tipinin en buyuk ve en kucuk degerlerini ekrana yazdiriniz
        System.out.println("Byte min value = "+Byte.MIN_VALUE+"\nByte max value = "+Byte.MAX_VALUE);

        Short minValue=Short.MIN_VALUE;
        Short maxValue=Short.MAX_VALUE;
        System.out.println("maxValue = " + maxValue);
        System.out.println("minValue = " + minValue);

        //primitive ler nasil Wrapper classa cevrilir
        float f1=13.99F;

        Float wrapperF1=f1;

        //wrapperlar nasil primitive olur
        Character w1='s';
        char primitiveW1=w1;

        //note=Autoboxing ve unboxing Java tarafindan otomatik olarak yapilir

    }
}
