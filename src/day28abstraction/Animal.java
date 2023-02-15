package day28abstraction;

public abstract class Animal {
    //bazen bazi methodlarin bodysi hic kulolanilmaz bu durumda o methodlarin bodysi silinir.
    // bodysi olmayan methodlara abstract method denir
    //bir methodu abstract method kullanmak icin method body i sil,abstract keywordu kullan,ve bulundugu classi abstract class olarak belirle
    //abstract classlarda hem abstract hemde abstract olmayan metholar kullanilabilir(concrate method)
    //abstract classin butun methodlarini childlari kullanmak zorundadir
    //bir method parent classda abstract method ise child method onu override edip kullanmalidir bunun icin herhangi
    // bir methodu child clasta zorunlu hale getirmek istiyorsak tum abstract methodlari override etmeliyiz
    public abstract void eat();

    public abstract void hareketEt();

    public static void drink(){
        System.out.println("Animzl drinks");
    }
    //ornegin browserlar navigat methodunu kulanmak zorundadir acak bunu abstract yaparim ve butun browserlar bunu kullanir
}
