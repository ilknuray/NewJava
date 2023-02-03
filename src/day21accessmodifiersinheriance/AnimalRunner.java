package day21accessmodifiersinheriance;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.miyav();
        cat.drink();
        System.out.println("");

        Dog dog = new Dog();
        dog.havla();
        dog.drink();
        dog.eat();
        System.out.println("");

        Bird bird = new Bird();
        bird.oter();
        bird.eat();
        bird.drink();
        /*
        1)
        *inheritance sayesinde kodtekrarindan kurtuluruz
        *maintenance(kod tamiori) kolay olur
        *Child classlari daha atomoik bir yapiya getiririz
        2)
        Bir classi baska bir classin child classi yapmak icin extends keyword kullanilir.ilk yazilan child class ikinci yazilan parent class olur
        3)
        Child class objectleri parent classtan method ve variablelari kullanabilir
        4)
        Parent class objectleri child classtan method ve variable kullanamazlar
        5)
        object class her classin parentidir
        Javada object class haric heer classin parenti vardir
         */


    }
}
