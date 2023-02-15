package day29abstractioncollections;

public class Civic implements Ac,Motor{

    @Override
    public void run() {
//interfacelerde methodbodysi olmadigi icin override ederken ikisinde ayni method olsa ile sikinti olmaz
        System.out.println("Civic iyi calisir");
    }
}
