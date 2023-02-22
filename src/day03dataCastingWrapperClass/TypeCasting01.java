package day03dataCastingWrapperClass;

public class TypeCasting01 {
    /*type casting = bir numeric data tipini digerine cevirmektir
    byte<short<int<long<double<float

    kucukten buyuge gidise-> auto widening=otomatik genisletme
    buyukten kucuge gidise->Explicit narrowing=acikca daraltma

     */
    public static void main(String[] args) {
        byte yas = 23;
        int yas2 = yas;
        byte yas3 = (byte) yas2;

        /*
        kucugu buyuge koymak kolay oldugu icin bu risksiz isi java direk yapar
        ancak buyugu kucuge koymak riskli oldugu icin java benden bir karar vermemi ister
        ve riski ben alip java ya bunu belirtirim.buna explicit narrowing denir.
         */

        //shortu double cevirelim
        short sayi = 123;
        double sayi2 = sayi;
        int sayi3 = (int) sayi2;

        //java yuvarlma islemi yapmaz virgulden sonraki kismi direk siler


        int num = 515;
        byte newnum = (byte) num;
        System.out.println("newnum = " + newnum);

        /*buyuk sayiyi kucuk data type ina atamak icin java onu kucultur orn:int i byte cevirirken boler ve moduler
        aritmetige gore kalan degeri verir*/
    }
}
