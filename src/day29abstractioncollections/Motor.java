package day29abstractioncollections;

public interface Motor extends Vehicle {

    /*
    class==>interface=>implements
    class==>==>class==>extends
    interface==>class==>mumkun degildir
    interface==>interace==>extends
     */
    void run();
    int price=2000;//interfacelerdeki tum variablelar public olmalidir.default olarak public atanir.ve tum variablelar otomatik olarak finaldir
    //atama yapmazsam hata verir bu yuzden.Interfacelerdeki butunvariablelar default olarak static tir


    double agirlik=20.8;

    /*
    abstract class ile interface arasindaki farklar nelerdir?
    *methodlar
    1)Abstract class hem abstract hemde oncrete methodlar icerebilir
    interfaceler ise sadece abstract methodlar icerir.ancak istersek default ve static keywordu ile concrete metodlar olusturabiliriz

    µµVariable
    1)Abstract classlarda normal classlardaki gibi her turlu variable olusturabiliriz
    interfacelerde ise variablelar public static ve final olmalidir

    **Inheritance
    1)abstract classlar class olduklari icin multiple inheritance soz konusu degildir
    interfaceler ise multiple inheritance i destekler

    **abstract classlarda constructor vardir ancak object olusturmakta kullanilamaz interfacelerde ise constructor olmadigindan object olusturulamaz

     */

}
