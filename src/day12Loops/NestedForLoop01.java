package day12Loops;

public class NestedForLoop01 {
    public static void main(String[] args) {
        int yukseklik=3;
        int en=4;
        for (int i = 1; i <=yukseklik ; i++) {
            for (int j = 1; j <=en ; j++) {
                System.out.print("*");

            }
            System.out.println();//ustteki pointeri al alt satira koy demektir bu yapilmazsa hepsini yanyana yazdirir

        }
        /*
        1
        12
        123
        1234
        12345
         */
        for (int i = 1; i <6 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }
        /*
        ****
        ***
        **
        *
         */

        for (int i = 1; i <=4 ; i++) {
            for (int j = 4; j >=i ; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
