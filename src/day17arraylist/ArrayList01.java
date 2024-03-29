package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println("names = " + names);

        List<String> cities = new ArrayList<>();
        cities.add("Trabzon");
        cities.add("Tokyo");
        cities.add("Tokat");

        names.addAll(2, cities);//remove all yaptiginizda sadece ilk list degisir parantezin icindeki list degismez.
        // removeall sadece list ile calisir icine parametre olarak list eklemaliyim
        System.out.println("names2 = " + names);

        names.removeAll(cities);
        System.out.println("names3 = " + names);
        List<String> Mynames = new ArrayList<>();
        Mynames.add("tom");
        Mynames.add("Thomas");
        Mynames.add("Tahsin");
        boolean sonuc = names.containsAll(Mynames);//Bir lstin icinde coklu elemanlarin var olup olmadigini kontrol
        // eder.Hpsi varsa true en az biri yoksa false doner.
        System.out.println("sonuc = " + sonuc);

        List<String> a = new ArrayList<>();
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

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println("a2 = " + a);

        //EX:3 bir maas listi olusturun salarie 10000 den az ise %20 10000 den az fazla ise %10 zam yapin

        List<Double> maas = new ArrayList<>();
        maas.add(12345.00);
        maas.add(8674.50);
        maas.add(15000.75);
        maas.add(9500.00);
        maas.add(20500.00);
        System.out.println("maas = " + maas);
        for (Double w : maas) {
            if (w < 10000) {
                maas.set(maas.indexOf(w), w * 1.2);

            } else {
                maas.set(maas.indexOf(w), w * 1.1);
            }
        }
        System.out.println("maas2 = " + maas);
        //set() methodu indexof ile birlikte kullanilir.
        //Jaavada para varsa double kullanilir

        //EX4:iki arrayinesit olup olmadigini kontrol eden kodu yaziniz
        //iki array listin esit olmasi icin elemanlar esit olmali ve ayni indexte bulunmali

        //NOTE/o,ce size i kontrol et eger esit dgilse calismasin,
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.Yol
        int counter=0;
        for (int i = 0; i < m.size(); i++) {
            if (m.size()!=n.size()){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
            if (m.get(i) != n.get(i)){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
        }
        if(counter==0){
            System.out.println("Listler esittir");
        }
        //2.Yol
        boolean esitMi=m.equals(n);
        if (esitMi){
            System.out.println("Listler esit");
        }else {
            System.out.println("Listler esit degildir");
        }


    }
}
