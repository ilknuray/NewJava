package day26exeptions;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Exception04 {
    public static void main(String[] args) {

        yas(-35);//IllegalArgumentException

    }
    //yasi ekrana yazdiran bir method olusturunuz
    public static void yas(int a){
        if (a<0){
            throw  new IllegalArgumentException("Yas negatif olamaz");
        }
        System.out.println(a);

    }
}
