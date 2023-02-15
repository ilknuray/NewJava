package day28abstraction;

public class Accord implements Motor,Klima,Kaporta{
    @Override
    public void eco() {
        System.out.println("uses engine");
    }

    @Override
    public void gas() {
        System.out.println("uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("uss tesi technology");

    }

    @Override
    public void digital() {
        System.out.println("uses digitale");

    }

    @Override
    public void climate() {
        System.out.println("uses cliate");

    }

    @Override
    public void celik() {
        System.out.println("uses celik");

    }
    /*
    Atomik olmasi icin parent classi parcalamak isteyebiliriz ancak java da bir child classin birdencok parent classi olamaz
    Yani java "multiple inheritance a izin vermez.Fakat java interface diye bir yapi olusturmustur ve jav abu yapida multiple inheritance a izin verir
     */
}
