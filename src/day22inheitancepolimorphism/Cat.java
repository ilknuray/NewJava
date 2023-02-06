package day22inheitancepolimorphism;

public class Cat extends Mammal{
    public int a=14;

    public void eat(){
        System.out.println("Cat eat");
    }
    public Cat(){
        /*super() parent constructor i cagirmak icin kullanilir.
         1)javada Object  olustururken Costructerlar parent tan childa dogru calisirlar
         2)Javda en ust parent constructora cikabilmek icin "super" kodu kullanilir
         3)super() kodu her constructorin ilk satirinda gizli olarak bulunur
         4)super() kodunu isterseniz gorunur sekilde de yazabilirsiniz
         5)super() kodunu gorunur sekilde yazarsaniz  ilk satir disinda baska bir yere yazmamalisiniz hata verir
         6)super() kodu Parent classtan constructor cagirmaya yarar
         */
    }

    @Override
    public void drink() {
        System.out.println("kedilr yer");
    }
}
