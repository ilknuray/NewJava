package day18arraylistpassbyvalue;

public class PasssbyValue01 {
    public static void main(String[] args) {
        //gomlek=100 ogrenci indirimi-10tl ogrenci gomlegi 90lira gazi indirimi-20 gazi gomlegi=80lira
        //gomlegin fiyati ayni degismedi ogrenci gomlegi ile gazi gomlegi fiyati degisir

        //Javada orjinal deger korunur default value ler herzaman korunur
        int x=12;
        System.out.println(x);
        //static method oln main methodun icindeki hersey static olmalidir.
        change(x);//Methodun static oldugunu gostermek icin italik sekilde yazilir.java yapar bunu.
        System.out.println(x);

    }
    public static void change(int a){
        System.out.println(a*3);
    }
    ///void hic birse uretmez sadece ekrana yazdirir

    //1)java variablelarin orjinal degerini korumak ister.
    //2)Variable lar METHODLAR INDE KULLANILDIGINDA java methodun icine orjinal degeri koymaaz o degerin kopyasini uretir ve method a o kopyayi yollar.
    //method kopya ustunde degisiklik yapar dolayisiyla variablein orjinal degeri korunmus olur.Bu sisteme pasBy value ddenir.

}
