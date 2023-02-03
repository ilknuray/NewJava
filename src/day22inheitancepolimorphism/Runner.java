package day22inheitancepolimorphism;

public class Runner {
    public static void main(String[] args) {
        Cat cat=new Cat();
        System.out.println(cat.a);
        System.out.println(cat.b);
        System.out.println(cat.c);
        Mammal mammal=new Mammal();
        System.out.println(mammal.b);
        System.out.println(mammal.c);
        System.out.println(mammal.a);
        Animal animal=new Animal();
        System.out.println(animal.a);
        System.out.println(animal.c);
        //ayni variableolsa bile inheritance da java objectin data tipine bakarak secer.
        // Oncelikkle istediginiz variable i Objectin data tipi olan classta arar
    }
}
