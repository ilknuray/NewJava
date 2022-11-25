package questions;

import java.util.Scanner;

public class IfStatementhizEhliyet {
    public static void main(String[] args) {
        /*
        kullanicidan aracinin hizini isteyiniz.trafik cezasinin degerini isteyin
        45 hiz siniridir
        55 74 arasinda ise ceza 100$ dir

        75 84 arasinda ise ceza 150$ dir

        85 94 arasinda ise 320$ dir

        94 den buyuk ise 500$ dir
        ve eger ayrica eger surucunun ehliyeti
        yoksa cezaya 2à0$ eklenir

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen hizinizi giriniz");
        int hiz= scan.nextInt();
        boolean ehliyetVarMi=true;
        int ceza=0;

        if (hiz>55&&hiz<74){
            System.out.println("Cezaniz 100 $ dir");
        } else if (hiz>75&&hiz<84) {
            System.out.println("Cezaniz 150$ dir");
        } else if (hiz>85&&hiz<94){
            System.out.println("Cezaniz 320! dir");
        } else if (hiz>94) {
            System.out.println("cezaniz 500$ dir");

        }else if (ehliyetVarMi==false){
            System.out.println("cezaniza 200$ eklenir");

        }else {

        }
    }
}
