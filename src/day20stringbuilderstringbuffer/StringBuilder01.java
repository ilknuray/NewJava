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
        5)String classlarin immutable yapisi guvenlik acisindan onemlidir.
        Ayni degere sahip birden fazla string oldugunda java bir tane container olusturur ve ayni degere sahip
        Stringlerin bu containeri kullannmasina izin verir.
        Bu memory i korumak icin iyidir ancak containerdaki degeri bir variable ici degistirdigimizde tum variable larin etkilenmesi tehlikesi vardir.
        Bu tehlikeden kurtulmak icin java stringleri immutable yapmistir.Fkat herhangi bir variable in degerini degistirmek icin java bir yol bulmustur.
        Degistirmek istediginiz variable icin java yeni bir conteiner olusturur ve variable in pointerini bu yeni variable a yonlendirir.Boylelikle hem
        degisim saglanmis hemde digerleri etkilenmemis olur.
         */

        String str="Java";
        str="Super Java";
        System.out.println("str = " + str);


        /*
        String pool:
         */
        String musteri="tom haks";
        String musteri2="tom hanks";
        String musteri3="Brad pitt";


        //StringBuilder nasil olusturulur
        //1.
        StringBuilder strb=new StringBuilder("Java");
        strb=new StringBuilder("Super Java");
        System.out.println("strb = " + strb);

        //2.
        StringBuilder strb2=new StringBuilder();
        strb2.append("Java");
        System.out.println("strb2 = " + strb2);




    }
}
