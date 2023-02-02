package day20stringbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        1)StringBuilder javada bir classtir
        2)StringBuilder string olusturmaya yarar
        3)String classi varken nede StrinBuilder kullaniriz?
        Cunku String immutable dir StringBuilder ise mutable dir.
        4)Immutabl classlarda var olan bir deger degistirilemez degistirmek istediginizde
        *Memoryde yeni bir variable yeni degerle olusturulur
        **Eski variablein poinyyeri yeni variable a dondurulur
        ***Eger bir variable i hic bir pointer gostermiyorsa o variable "Garbege collector" tarafindan silinir.
        Mutable classlarda var olan deger degistirilerbilir orijinal deger korunmaz.
         */

        String str="Java";
        str="Super Java";
        System.out.println("str = " + str);
        StringBuilder strb=new StringBuilder("Java");
        strb=new StringBuilder("Super Java");
        System.out.println("strb = " + strb);

    }
}
