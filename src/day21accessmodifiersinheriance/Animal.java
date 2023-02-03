package day21accessmodifiersinheriance;

public class Animal {
    public void eat(){
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drinks...");
        //Multilevel inheritance:Java bunu ddestekler
        //hierarchical inheritance:Bir parent birden fazla child oan inheritancelardir
        //multiple inheritance:bir child iki parent.jAVA BUNU DESTEKLEMEZ;cunku child class icin bir karmasa olur.
        //Single inheritance:Bir child class icn bir parent class demektir
    }
}
