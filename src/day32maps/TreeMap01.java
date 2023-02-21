package day32maps;

import java.util.TreeMap;

public class TreeMap01 {
    /*
    tree ùmapler entry setleri keylere gore natural orderda siralar
    treemapler en yavas maplerdir cunku siralama ile ugrasirlar
    Thread safe ve syncronized degildir

     */
    public static void main(String[] args) {
        TreeMap<String,Double>salaries=new TreeMap<>();
        salaries.put("Tom",3000.00);
        salaries.put("Mary",1000.00);
        salaries.put("Jimmy",5000.00);
        salaries.put("Kevin",6000.00);
        System.out.println(salaries);
    }
}
