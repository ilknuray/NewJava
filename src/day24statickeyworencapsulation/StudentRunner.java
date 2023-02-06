package day24statickeyworencapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student std1 = new Student();
        System.out.println(std1.getId());
        std1.setId("AB");
        System.out.println(std1.getId());
        //set sadece degistirir ancak okuma islemi yani gorebilmek icin get methodu kullanmaliyiz
        //butun degisimler objct ustundedir class ta degil

        //NOTEEE:encapsulation sayesinde bir islem icin 4 farkli deger kulanmam gerekiyorsa bu degerler
        // icin 4 farkli object uretmeden set methodu ile donusturerek kullanabiiriz.bir object i 1000 object olarak kullanabiliriz


    }
}
