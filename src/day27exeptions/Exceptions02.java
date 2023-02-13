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
        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }

        /*
        1)FileInputStream fis = new FileInputStream("src/day27exeptions/File1.txt");
        new den sonraki kisim hata verir.cunku biz java ya verilen adrese git dedik java iki endiseye kapilidi.
        *Ya adres yanlissa
        **Ya bu dosya sikinmisse
        Biz method isminden sonre "throws FilNotFoundException " yazarak java ya bu iki endise duydugun durum olursa excption at dedik

        2) while ((k= fis.read())!=-1){ yazdigimizda "read()" methodu hata verir.cunku biz java ya dosyadaki karakterleri oku dedik.
        Java bir endiseye kapildi
        *Ya okumasi gerekne karakterler javanin bilmedigi karakterlerse Biz method isminden sonra throws IOException yazarak exception at dedik

        3)Method isminden sonra throws ioexceptin yazarsniz java throws FilNotFoundException i siler.Cunku IOException FilNotFoundException i
        kapsar.IOException FilNotFoundException in parentidir.onun yaptigi herseyi yapabilir o yuzden IOException varken  FilNotFoundException a
        ihtiyac yoktur.
         */

    }
}
