package day16MDSarraylists;

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
    }
}
