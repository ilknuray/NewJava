package day16MDSarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        /*
        ArrayListler ayni data tipine sahip birden fazla data yi depolamak icin kullanilir.Array ile arrayListin farki nedir?
        1-Array olustutruken array icine kac eleman koymamiz gerektigini soylemeliyiz ve soyledigimizden fazlasini koyamayiz
          Arrayler eleman sayisinda fixed dirler.
          Array listleri olusturuken eleman sayisini soylememize gerek yoktur cunku arraylistler eleman sayisinda flexible dir.
          java nin arryalistleri olusturmasinin sebebi
        2-Arraylerin icine primitive ve referance lar konabilir
        arraylistlerin icine ise sadece non primitiveler konur.
        3-Arrayler superfast tir ve arrayler memoryi cok az kullanilir.
        eger length hakkinda eminsek array kullanmamiz daha mantikli olacaktir.
        Eger uzunlugunun degisme ihtimali varsa Arraylist kullanmak daha mantiklidir.
         */
        //ArrayList nasil olisturulur
        ArrayList<Integer>ages=new ArrayList<>();
        ArrayList<Integer>heights=new ArrayList<Integer>();
        List<Integer>nums=new ArrayList<>();

        //ArrayList ler nasil yazdirilir?
        System.out.println("nums = " + nums);
        //ArrayListlere nasil eleman eklenir
        nums.add(21);//=>boolean return eder.TRUE gorev tamam FALSE yerlestirilemedi demektir
        nums.add(18);
        System.out.println("nums1 = " + nums);
        //add methodu elemani herzaman elemani sona ekler (insertion order)

        nums.add(2,27);//verilen indexe verilen degeri ekler.eger ekleyemezse birsey return etmez
        //void birsey dondurmeyen demektir
        List<Integer>prices=new ArrayList<>();
        prices.add(33);
        prices.add(185);
        nums.addAll(prices);
        System.out.println("nums2 = " + nums);
        nums.addAll(2,prices);//istedigim index e istedigim listi ekler
        System.out.println("nums3 = " + nums);




    }
}
