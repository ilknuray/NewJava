package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
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
