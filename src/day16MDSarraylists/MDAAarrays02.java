package day16MDSarraylists;

public class MDAAarrays02 {
    public static void main(String[] args) {
        //bir mda araysdeki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz
        int arr[][]={{2,5,1},{83,75}};
        int max=arr[0][0];
        int min=arr[0][0];
        for (int[] w:arr) {
            for (int k:w) {
                max=Math.max(max,k);
                min=Math.min(min,k);
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println(min+max);




    }
}
