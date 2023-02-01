package day18arraylistpassbyvalue;

public class Varargs01 {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println(add(2,3));
        //1)farkli sayilarda ki parametrelerle ilgili islem yapmak isterseniz varrargs kullanmalisiniz
        //2)varargs arka planda array kullanir bu yuzden arraylerle calisiyor gibi davranabilirsiniz
        //3)varargs olusturmak icin data type ... varargs isim
        //4)bir methodta varargs in yaninda baska bir parametre kullanilabilir mi?
        //kullanilabilir ancak varargs lar en sona yazilmalidir onune baska parametreler konulabilir.ikinci kima yazarsak ulasilamayan kod olur
        //5)Bir methodta birden fazla varrargs kullanilabilir mi?
        //kullanilamaz cunku hangisi onde olursa olsun sonrasinda gelen parametreler ulasilamayan parametre olurlar
    }

    private static void topla( int a,int b) {

    }
    public static int add(int... a){
        int sum=0;
        for (int w:a) {
            sum+=w;

        }
        return sum;
    }
}
