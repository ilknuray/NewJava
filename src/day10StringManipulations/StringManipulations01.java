package day10StringManipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String a = "  Java kolaydir";
        boolean b = a.startsWith("va", 2);
        System.out.println("b = " + b);
        //ikinci karakterden sonra ne ile basliyor bunu getirir yani va ile mi basliyor
        a = a.replaceFirst("a", "*");
        System.out.println("a = " + a);//stringte degistirilmasi istenen karakterin ilkini  degistirir

        a = a.concat(" Anladin mi?");
        System.out.println("a = " + a);
        //concat + ile ayni seyi yapar ancak concat() i kullanmak daha dogrudur cunku java bunun icin uretmis bu methodu
        a = a.trim();//bastaki ve sondaki spaceleri siler aradaki space e dokunmaz
        System.out.println("a = " + a);
        //bir insanin ismi space ile baslamayacagi icin bu trim() methodu kullanilir

        String c = "Java";
        String d = "Kava";

        int e = c.compareTo(d);//harflerin buyuk ve kucukleri arasinda 32 fark vardir
        //bu methodta buyuk kucuk harf farki olmasini istemiyirsak compareToIgnore() methodunu kullaniriz

        System.out.println("e = " + e);
       //compareto() iki stringi alfabetik olarak karsilastirir.case sensetive dir.burada c den d cikarilir
        a = a.repeat(3);
        System.out.println("a = " + a);
      //repeat() methodu istenilen stringi istenilen sayida yanyana yazdirir.

    }
}
