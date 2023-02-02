package day21accessmodifiersinheriance;

public class Student {
    /*
    Access MODIFIER
    1)public=>herkes
    2)protected=>child classlar
    3)default=>sadece o package
    4)private=>sadece o class
    NOTE:access modifierlari gnisten dara ogru sayiniz:
    public-protected-default-private
    NOTE:protected ile default farklari
    protected olanlar bska packagelardan ulasilailr default olanlar kullanilamaz
    NOTE:classlar icin hangi access modifierlar kullanilabilir
    public ve default kullanilabilir
     */
    public String stdName="TomHanks";
    protected String adress="Miami";//baska packagelardan kullanilamaz ancak baska packagede child classi varsa o class kullnabilir
    String email="tomhanks@gmail.com";//defult yazmayiz zaten otomatik olarak default degeri verir
    private String stdId="20206517004";//Sadece ayni classta kullanilirlar



}
