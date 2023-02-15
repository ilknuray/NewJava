package day29abstractioncollections;

public interface Motor extends Vehicle {

    /*
    class==>interface=>imlements
    class==>==>class==>extends
    interface==>class==>mumkun degildir
    interface==>interace==>extends
     */
    void run();
    int price=2000;//interfacelerdeki tum variablelar public olmalidir.default olarak public atanir.ve tum variablelar otomatik olarak finaldir
    //atama yapmazsam hata verir bu yuzden.Interfacelerdeki butunvariablelar default olarak static tir


    double agirlik=20.8;

}
