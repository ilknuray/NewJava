package day15ArraysMultidimensionelArrays;

public class Arrays03 {
    public static void main(String[] args) {
        //EX:Bir strindteki sesli harflerin sayisini bulan kodu yaziniz

        String str="java guzeldir";
        String harfler[]=str.split("");
        int count=0;
        for (String w:harfler) {
            if(w.contains("a")||w.contains("e")||w.contains("i")||w.contains("o")){
                count++;
            }
            //System.out.println("count = " + count);
        }
        System.out.println("count = " + count);
    }

}
