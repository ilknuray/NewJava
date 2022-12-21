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
        //Java arrayleri yazdirirken aralarina otomatik olarak virgul koyar

        //string bir array olusturunuz ve icine tomdan onceki tum elemanlari yazdiriniz

        String arr[]={"Jane","Mark","Christopher","Tom","Ali","Rojda"};

        for (String w:arr) {
            System.out.println("w = " + w);
            if (w.equals("Tom")) {
                break;
            }

        }

    }
}
