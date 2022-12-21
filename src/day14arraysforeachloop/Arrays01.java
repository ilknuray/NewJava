package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        //Arrayslerin icine sadece primitive data type lar ve reference lar yerlestirilebilir
        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";
        System.out.println(Arrays.toString(str));//bu sekilde yazdirmazsam sadece reference i yazdirir.
        //Java arrayleri yazdirirken aralarina otomatik olarak virgul koyar

        //string bir array olusturunuz ve icine tomdan onceki tum elemanlari yazdiriniz

        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : arr) {
            System.out.println("w = " + w);
            if (w.equals("Tom")) {
                break;//break loop u kirar
            }

        }
        //tom ve jane haric tum elemanlari yazdiriniz

        String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        for (String w : brr) {
            if (w.equals("Jane") || w.equals("Tom")) {
                continue;//bosver demektir
            }
            System.out.println("w = " + w);

        }
        //EX:kullanici ile beraber bir array olusturunuz.bir ogretmenin ogrencilerinin isimlerini applicationa yuklemesini sagalayan kodu yaziniz
        Scanner sc=new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int ogrenciSayisi= sc.nextInt();
        String names[]=new String[ogrenciSayisi];
        for (int i = 1; i <=ogrenciSayisi ; i++) {
            System.out.println("Lutfen "+ i + " ogrenci ismini giriniz");
            names[i-1]= sc.next();


        }
        System.out.println(Arrays.toString(names));

        }



    }

