package day32maps;

public class EnumRunner {
    //enumlar sabit datalar iceriri bu yuzden final yapariz ve setter kullanmamaiza gerek yoktur
    public static void main(String[] args) {
        System.out.println(USstates.ALABAMA.getStateName());
        System.out.println(USstates.ALASKA.getKisaltma());
    }
}
