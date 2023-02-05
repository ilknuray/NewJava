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
        this();//ayni classin icinde diger costructori kullan
        System.out.println("Constructor 2");
    }
}
