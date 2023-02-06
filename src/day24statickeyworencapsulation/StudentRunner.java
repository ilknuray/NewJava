package day24statickeyworencapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student std1 = new Student();
        System.out.println(std1.getId());
        std1.setId("AB");
        System.out.println(std1.getId());
        //set sadece degistirir ancak okuma islemi yani gorebilmek icin get methodu kullanmaliyiz

    }
}
