package day27exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
    public static void main(String[] args) throws IOException {
        readTheTextFromTheFile();

    }

    //Bir text file daki texti okuyan kodu yaziniz
    public static void readTheTextFromTheFile() throws IOException {

        FileInputStream fis = new FileInputStream("src/day27exeptions/File1.txt");//adres yanlis yada dosya bos olabilir diye java bizi ikaz eder CTE verir.
        int k=0;
        while ((k= fis.read())!=-1){
            System.out.print((char)k);
        }

    }
}
