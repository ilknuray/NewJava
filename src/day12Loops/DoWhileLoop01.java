package day12Loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        int a = 1;

        do {
            System.out.println("do while loop");
            a++;
        } while (a < 1);
        //dowhileloop kullanildiginda loop badisi icindeki kod en az biekez calisir yani zero execution mumkun degildir
        //while loop ise bazi durumlarda calismayabilir.zero execution mumkundur


        //EX:bir ondalikli sayinin ondalik kismindaki rakamlarinin toplamini bulunuz

        double sayi = 24.5673;
        String str = String.valueOf(sayi);//parantezin icine konulan sayiyi string yapar
        //Regex icin nokta kullandiginizda onune \\ koyunuz yani nokta \\. seklinde kullanilir
        String virgulSonrasi=str.split("\\.")[1];
        int virgulInt=Integer.valueOf(virgulSonrasi);

        int top=0;

        do {
            top+=virgulInt%10;
            virgulInt/=10;

        }while (virgulInt>0);
        System.out.println("Toplam : "+top);





    }
}
