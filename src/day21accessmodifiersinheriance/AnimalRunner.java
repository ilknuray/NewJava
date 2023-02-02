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


    }
}
