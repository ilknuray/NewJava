package day15ArraysMultidimensionelArrays;

import java.util.Arrays;

public class MultidimensionalArrays01 {
    public static void main(String[] args) {
        //NOTE:bir arrayin elemanlari array ise bu arrayler MDS dir.
        //mds nasil olusturulur?

        int arr[][] = new int[3][2];

        System.out.println(Arrays.deepToString(arr));

        //MDS lere lememan ekleme nasil yapilir?
        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][0] = 6;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;

        System.out.println(Arrays.deepToString(arr));

        //mds de array elemanlardan birisi nasil yazdirilir?
        System.out.println(Arrays.toString(arr[1]));//bu kisim array oldugu icin toString ilr yazdirilir.
        System.out.println(arr[1][1]);//ic kismi direk yazdirabilirim int oldugu ve array olmadigi icin

//EX:string bir mds olusturunuz ve elemanlari ekleyiniz toplam eleman sayisini yazdiran kodu yaziniz
        String str[][]=new String[2][2];
        str[0][0]="ali";
        str[0][1]="lutfen";
        str[1][0]="ata";
        str[1][1]="bak";
        System.out.println(Arrays.deepToString(str));
        int elemanSayisi=0;
        for (String[] z:str) {
            elemanSayisi+=z.length;

        }
        System.out.println("elemanSayisi = " + elemanSayisi);

    }
}
