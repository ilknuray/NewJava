package day22inheitancepolimorphism;

public class Runner {
    public static void main(String[] args) {
        Cat cat=new Cat();
        System.out.println(cat.a);
        Mammal mammal=new Mammal();
        System.out.println(mammal.a);
        Animal animal=new Animal();
        System.out.println(animal.a);
    }
}
