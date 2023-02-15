package day28abstraction;

public class Civic implements Motor,Kaporta,Klima{

    @Override
    public void eco() {
        System.out.println("usue eco engine");
    }

    @Override
    public void gas() {
        System.out.println("uses gas+");
    }

    @Override
    public void tsi() {
        System.out.println("use tsi technology");

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
}
