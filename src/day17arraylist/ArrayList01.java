package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        List<String>names=new ArrayList<>();
        names.add("tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println("names = " + names);

        List<String>cities=new ArrayList<>();
        cities.add("Trabzon");
        cities.add("Tokyo");
        cities.add("Tokat");

        names.addAll(2,cities);//remove all yaptiginizda sadece ilk list degisir parantezin icindeki list degismez.
                                    // removeall sadece list ile calisir icine parametre olarak list eklemaliyim
        System.out.println("names2 = " + names);

        names.removeAll(cities);
        System.out.println("names3 = " + names);
        List<String>Mynames=new ArrayList<>();
        Mynames.add("tom");
        Mynames.add("Thomas");
        Mynames.add("Tahsin");
        boolean sonuc=names.containsAll(Mynames);//Bir lstin icinde coklu elemanlarin var olup olmadigini kontrol
                                                // eder.Hpsi varsa true en az biri yoksa false doner.
        System.out.println("sonuc = " + sonuc);

        List<String>a=new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println("ailk = " + a);
        ///EX1:a listinde shoes elemanin ilk gorunumunu siliniz

        a.remove("Shoes");
        System.out.println("a = " + a);

        //tum shoeslari siliniz

        List<String>silinecekler=new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println("a2 = " + a);



    }
}
