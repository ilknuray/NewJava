package day11Loops;

public class NestedLoop01 {
    public static void main(String[] args) {
        int week=4;
        int day=30;
        for (int i = 1; i < 5; i++) {
            System.out.println("week : "+i);
            for (int j = 1; j <8 ; j++) {
                System.out.println("day : "+j);

                //System.out.println("week : "+i+"day : "+j);
            }

        }


    }
}
