package day21accessmodifiersinheriance;

public class StudentRunner {
//normal applicationlarda sadece bir tane main method olur.Bircok class vardir ama sadece birinde main method vardir
public static void main(String[] args) {
    Student student=new Student();
    System.out.println(student.adress);
    System.out.println(student.email);
    System.out.println(student.stdName);
}
}
