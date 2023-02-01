package day18arraylistpassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //EX:1 ir list icideki 7 haric tum elemanlari 2 arttiiniz
        List<Integer>ages=new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w:ages) {
            if (w==7){
                continue;
            }
            //w=w+2;=>Listler boyle update edilmez
            ages.set(ages.indexOf(w),w+2);

        }
        System.out.println("ages = " + ages);
    }
}
