package day22inheitancepolimorphism;

public class Runner {
    public static void main(String[] args) {
        Cat cat=new Cat();
        System.out.println(cat.a);
        System.out.println(cat.b);
        System.out.println(cat.c);
        Mammal cat2=new Cat();
        System.out.println(cat2.b);
        System.out.println(cat2.c);
        System.out.println(cat2.a);
        Animal cat3=new Cat();
        System.out.println(cat3.a);
        System.out.println(cat3.c);
        //ayni variableolsa bile inheritance da java objectin data tipine bakarak secer.
        // Oncelikkle istediginiz variable i Objectin data tipi olan classta arar
        //Classin kendisinde aranan variable yoksa var olan parent classa gider ve oradakini kullanir.eger oaradad bulamazsa hata verir

        //object olustururkrn objectin data type child classlardan secilemez
        Cat cat4=new Cat();
        cat4.eat();
        //inheritanc da methodlar secilirken java consructora bakar oncelikle istedigimiz methodu constructori kullanilan classtan alir

        Mammal cat5=new Mammal();
        cat5.eat();

        Animal cat6=new Animal();
        cat6.eat();

    }
}
