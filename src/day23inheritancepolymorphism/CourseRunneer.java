package day23inheritancepolymorphism;

public class CourseRunneer {
    public static void main(String[] args) {
        Math m=new Math(5);
        /*1)override yapilirken methodun body si degistirilir
         2)override yapilirken ASLA method signature degistirilmez
         3)override yaparken inheritance yapilmak zorundadir cunku override child clasta yapilir inheritance olmayan yerde override olmaz
         4)override yapilirken access modifierlar farkli kurallara gore farklilasabilirler.
         5)private methodlar override edilemezler
         6)child classtaki override edilen method un access modifieri parent classtaki methodun access modifieri ile ayni yada daha genis olmalidir
         cocuk babayi sinirlandiramaz ancak baba cocugu sinirlandirabilir
         default methodlar ayni package icindeyse override edilebiirler farkli package icinde override edilemezler
           Parebt classa koydugumuz methodlar genel metodlardir butun child classlara uyacak sekilde dizayn edilmislerdir.
           Ancak bazi child classlar ozellestirmek ister bu methodu o yuzden override yapilir
         7)Parent classataki methodun return type i void ise return type ddegistirilemez
         8)reurn type i primitive ise return type i degistirilemz
         9)parent classtaki methodun return type i Wrapper class ise return type degistirilemez
         10)Parent classdaki methodun return type i parent class ise return type child lardan biri olabilir
         child taki return type parenttakinin return type olabilir ama tersi mumkun degildir kapsayici olan ustte olmali
         child classtaki return type parent classtakinden buyuk olamaz
        NOTE:Aralarinda parent child iliskisi olmayan classlar override ile return type degisiminde bulunamazlar
        ornegin integer ve short arasi degisim yapilamaz cunku aralarinda parent child iliskisi bulunmuyor
         */


        /*
        NOTE:Child taki methodun return typeindan parenttaki methodun return type ina gidisde is a olmali
        parenttan childe gelirken de has a iliskisi vardir
        Aralarinda is a yada has a iliskisi olan data type lara covariant denir
         */
        //parent classtaki override edilen methoda overridden denir

        /*
        =>> final keyword nedir?
        1)variablelarla kulanilabilir
        public final int age=12;
        bir kere deger atadiktan sonra bir daha degistiremeyiz.buna final variable denir
        Final variable lara deger atamak zorundayiz yoksa hata verir


        2)methodlarla kullanilabilir
        public final int add(){}
        bir method olusturulurken final olarak olusturulmussa o body degistirilemez
        final methodlar override edilemezler.cunku overriding te method body degidtirilir final method body degistirilmesine musaade etmez


        3)classlarda kullanilabilir
        bir classi final yaparsak o classi kisirlastirmis oluiruz
        bir class final ise o classa extends edilemez
        final class child olabilir baska classi extends edebilir

         */

    }
}
