package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    /*
    throws ile throws araindaki farklar nelerdir?
    1)throw methodun bodysinin icinde kullanilir thows ise methodun isminden sonra kullaniilir
    2)throw dan sonra object olusturulur,throws tan sonra ise exception classin ismi yazilir
    3)throw methodun icinde istedigimiz yerde exception uretmek  icin kullanilir,throws ise var olan checked exceptioni atmak icin kullanilir
    4)throw dan sadece bir tane exception olabilir,throwsdan sonra birden fazla exception olabilir

    rte lerde throws kullanilimaz cte lerde kullanmaak zorundayim
     */
    public static void main(String[] args) {
        readFile();

    }
    public static void readFile(){
        try {
            BufferedReader br=new BufferedReader(new FileReader("src/day27exeptions/File1.txt"));
           String line= br.readLine();
           while (line!=null){
               System.out.println(line);
               line= br.readLine();
           }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu yanlis yada dosya silinmistir"+e.getMessage());
        } catch (IOException e) {
            System.out.println("okunamayacak karakter veya karakterler var"+e.getMessage());
        }
    }
}
