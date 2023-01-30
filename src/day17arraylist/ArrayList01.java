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

        names.addAll(2,cities);
        System.out.println("names2 = " + names);

    }
}
