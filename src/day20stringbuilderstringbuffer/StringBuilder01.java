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
        strb2.append(" is easy");
        strb2.append("!!!");
        //String d string leri birbirine eklemek icin concat kullaniyorduk builder da ise appened methodunu kullaniyoruz.
        System.out.println("strb2 = " + strb2);
        //ekleme2.yol
        strb2.append("Learn").append(" java earn").append(" money");
        System.out.println(strb2);

        //StringBuilderlarda karakter sayisi nasil bulunur?
        StringBuilder strb3=new StringBuilder();
        strb3.append("catcccccccc");

        int numOfChar=strb3.length();
        System.out.println(numOfChar);

        int capacty=strb3.capacity();
        System.out.println(capacty);
        //once hemen 16 lik bir capact ayirir asimlarda se var olan kapasiteenin iki katinin iki fazlasini  verir

        strb3.setCharAt(3,'T');
        System.out.println(strb3);//DELETE CHARAT ilk index dahil ikinci index dail olmamakla birlikte aradaki karakterleri siler


        strb3.delete(3,6);
        System.out.println(strb3);

        strb3.deleteCharAt(6);

        strb3.reverse();//TESR CEVIRIR.
        System.out.println(strb3);
        //mutable laarda sadece method kullanmak orijinal degri degistirmek icin yeterlidir
        //Ancak immutable larda sadece method kullanmak yaterli olmaz atama da yapmak gereklidir.
        //EX:
        String abc="Java";
        abc=abc.replaceAll("a","i");
        System.out.println(abc);

        String stringStrb3=strb3.toString();//StringBuilderlari stringe cevirir
        System.out.println(stringStrb3);//datanin degisime kapatilmasi icin stringr geceriz yada srngb de
        // olmayan methodlardan yaralanmak icin stringe donebiliriz

        StringBuilder strb4=new StringBuilder(stringStrb3);//Stringden strb ye donduk
        System.out.println("strb4 = " + strb4);

        strb4.insert(3,"XXX");//verilen karajterden  sonra istenen degisimi ekler.
        System.out.println(strb4);
        //Baska bir insert methodu istedigim karakterden aslamak sartiyla istedigim kelimenin istedigim araliktaki indexini araya yerlestirir


        StringBuilder a=new StringBuilder("Java");
        StringBuilder b=new StringBuilder("Java");
        int sonuc=a.compareTo(b);
        System.out.println("sonuc = " + sonuc);

        //CompereTo ki stb yi birbiri ile kiyaslar.ikisi de ayni ise farki 0 verir.
        //Alfabetik sirada aralarindaki farki verir.- yada + olarak oncelik durumlarina gore farki verir
        //Kucuk harf ile buyuk arasindaki fark 32 dir or/J ile j aeasindaki fark 32 DIR










    }
}
