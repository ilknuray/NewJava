package day15ArraysMultidimensionelArrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //EX1:SIZE VERILEN BIR INT arraydeki en buyuk negatif ve en kucuk pozitif elemani bulunuz.
        int arr[]={-12,18,-5,23,-2,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int maxNegatif=arr[0];
        int minPozitif=arr[arr.length-1];

        for (int w:arr) {
            if (w<0){
                maxNegatif=Math.max(maxNegatif,w);
            }
            if (w>0){
                minPozitif=Math.min(minPozitif,w);
            }
        }
        System.out.println("minPozitif = " + minPozitif);
        System.out.println("maxNegatif = " + maxNegatif);

    }
}
