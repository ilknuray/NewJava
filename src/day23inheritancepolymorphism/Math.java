package day23inheritancepolymorphism;

public class Math extends Courses {
    public void practise(){
        System.out.println("Solve questions");
    }
    public Math(){
        super("second");
        System.out.println("Constructor 1");
    }
    public Math(int a){
        this();//ayni classin icinde diger costructori kullan.ayni classtaki constructori kullanmayi soyler supeer ise parent classa git
        // demektir.Hangisine gidcegimzi ise icindeki parametrler belirtir.eger ilgli cons un icinde supe methodu yoksa default olarak
        // var gibi dusunup parent classtaki parametresiz cons u calistirir.
        System.out.println("Constructor 2");
    }
}
