package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {
        Queue<String>depo=new LinkedList<>();
        depo.add("milk");
        depo.add("bread");
        depo.add("honey");
        depo.add("meat");
        depo.add("tomatoes");
        System.out.println("depo = " + depo);
        //Queuelar elemanlari gelis sirasina gore dizerler

        depo.offer("Potatoes");//elemani eger kapasite uygunsa ekler cunku burada sinir koyabiliyorum.eger kapasite uygun degilse exception atar
                           //boolean  doner
        System.out.println(depo);
    }
}
