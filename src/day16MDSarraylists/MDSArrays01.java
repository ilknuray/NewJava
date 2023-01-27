package day16MDSarraylists;

import java.util.Arrays;

public class MDSArrays01 {
    public static void main(String[] args) {
        //Bir tane mds array olusturun ve icindeki elemanlarin toplamini veren kodu yazin
        int arr[][]={{2,5,1},{32,75},{13,21,43,56}};
        int sum=0;
        for (int[] w:arr) {
            for (int k:w) {
                sum+=k;

            }

        } System.out.println("sum = " + sum);
        //Array veya collection varsa foreach kullanmak ilk tercihtir,bunlar var ancak index kullanmak zorunda isem
        //foreach calismaz diger donguleri kullanmak gerektir
        //EX:MDS arrayi normal arraye ceviren kodu yaziniz

        int brr[][]={{2,5,1},{32,75}};
        //MDS deki eleman sayisini bulunuz
        int elemanSayisi=0;
        for (int[] w:brr) {
            for (int k:w) {
                elemanSayisi++;
            }
        }
        System.out.println("elemanSayisi = " + elemanSayisi);
             int idx=0;
        int [] yeniArray=new int[elemanSayisi];
        for (int[] w:brr) {
            for (int k:w){
                yeniArray[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeniArray));

    }
}
