package day30collections;

import java.util.PriorityQueue;

public class PriorityQueue01 {
    public static void main(String[] args) {
        PriorityQueue <String>myQueue=new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");
        System.out.println(myQueue);
        /*
        Biz soylemedikce java priorty ile kendine gore bir siralama yapar ama biz istersek bazi siralamalar yapabiliriz
         */
    }
}
