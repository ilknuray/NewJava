package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Arrayslerin icine sadece primitive data type lar ve reference lar yerlestirilebilir
        String str[]=new String[3];
        str[0]="Java";
        str[1]="did";
        str[2]="surprise you";
        System.out.println(Arrays.toString(str));//bu sekilde yazdirmazsam sadece reference i yazdirir.


    }
}
