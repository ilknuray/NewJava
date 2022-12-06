package day04_Ifstatements;

public class IfStaments {
    public static void main(String[] args) {

        //EX:sayi pozitif ise ekrana pozitif yazdirin
        int sayi=-12;
        if (sayi>0){
            System.out.println("Pozitif");
        }else {
            System.out.println("Negatif");
        }
        //if statements belli kodlari belli sartlara bagli olarak calistirmaya yarar


        //EX:verilen karakter buyuk harf ise ekrana buyuk harf yazdirin
        char karakter='A';
        if (karakter>='A'&& karakter<='Z'){
            System.out.println("Buyuk harf");
        }else {
            System.out.println("Kucuk harf");
        }
        //&& islemi sadece boolean ile kullanilir true && true olmali.

        //EX:verilen sati 3 basamakli ise ekrana uc basamakli yazdirin
        int sayi1=100;
        if (sayi1>99 && sayi1<1000){//esitlik vermektense busekilde yazmak daha dogrudur
                                    // <= dedigimde java iki kez calisirdiger turlu 1 kez calisir daha hizli olur
            System.out.println("uc basamakli sayi");

          //EX:verilen sayi cift sayi ise ekrana cift sayi yazdirin
            int sayi2=150;

            if (sayi2%2==0){
                System.out.println("Cift sayi");
            }else {
                System.out.println("Tek sayi");
            }
        }
        //EX:verilen sayi 300 DEN KUCUK VEYE 500 den buyukse "Harika sayi uazdirin

        int sayi3=250;

        if (sayi3<300 || sayi3>1200){
            System.out.println("Harika sayi");
        }else {
            System.out.println("yanlis giris");
        }
    }//  || sadece blooen ile kullanilir ancak && gibi sert degildir
    // ikiside false degilse diger tum durumlarda true verir

}
