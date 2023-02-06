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

    }
}
