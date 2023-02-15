package day29abstractioncollections;

public class Runner {
    public static void main(String[] args) {
        System.out.println(Motor.price);

        System.out.println(Ac.price);

        System.out.println(Motor.agirlik);
        System.out.println(Ac.agirlik);

        /*
        intefacelerde methodisimlerinin ayni return typr larinin farkli olmasi sikinti cikarir ancak variable
         isimleri aynidata type lari farkli olabilir herhangi bir sikinti olusmaz

         Note:interfacelerde constructor olmadigi icin interfacelerden obje olusturulamaz.
         abstract classlarda class olduklari icin constructor vardir ancak object olusturamazlar.
         java da interface ve abstract classlardan object olusurulamaz.
         */

    }
}
