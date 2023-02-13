package day27exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions02 {
    public static void main(String[] args) {

    }

    //Bir text file daki texti okuyan kodu yaziniz
    public static void readTheTextFromTheFile() throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("src/day27exeptions/File1.txt");//adres yanlis yada dosya bos olabilir diye java bizi ikaz eder CTE verir.


    }
}
