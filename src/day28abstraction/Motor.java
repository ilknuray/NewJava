package day28abstraction;

public interface Motor {
     void eco();//interfacelerdeki tum methodlar abstract olmak zorundadir.
    // interfacelerde abstract method olustururken abstract keyword olusturmaya grek yoktur
    //interfacelerdeki methodlar java tarafindan otomatik olarak public kabul edilir yazilbirlir ama gerek yoktur.

    void gas();

    void tsi();
    /*
    Note:interfacelerdeki tu methodlar abstract oldugu icin interfacelere fully abstraction denir.Abstract classlarda
    abstract method ve concrete methodlar
    bir arada oldugu icin abstract classlara fully abstraction denmez
     */
    public default int add(int a,int b){
        return a+b;

        //default keyword kullanarak interface lerin icinde body si olan methodlar uretebilirsiniz
        //non static methodtur ve objectlere yapisiktir object olusturularak kullanilabilir
    }
    public static String update(String str){
        return str+"!";
        //static keyword kullanarak interfacelerin icinde bodysi olan methodlar uretebilirsiniz

        //Satic kullanirsak bu static method lur ve heryerden kullanilabir.
        //absract methodlar override edilmek zorundadir.
    }
}
