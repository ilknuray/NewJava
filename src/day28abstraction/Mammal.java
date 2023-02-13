package day28abstraction;

public class Mammal extends Animal{

    //parent abstract classinda abstract methodlar varsa child classi abstract yapmalisiniz
    // yada parent classtaki tum abstract methodlari override etmelisiniz
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void eat() {

    }

    @Override
    public void hareketEt() {

    }
}
