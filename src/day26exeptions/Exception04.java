package day26exeptions;



public class Exception04 {
    public static void main(String[] args) {

        yas(-35);//IllegalArgumentException

    }
    //yasi ekrana yazdiran bir method olusturunuz
    public static void yas(int a){
        if (a<0){
            throw  new IllegalArgumentException("Yas negatif olamaz");
        }
        System.out.println(a);
        /*IKI cesit exception turu vardir:
        1)RTE:buna unchecked exception da denir.Cunku kodu yazarke degil calistirdiktan sonra kontrol eder ve hatayi bize bildirir
        2)CTE:buna da checked exception da denir cunku calismadan once daha kd yazma esnasinda bize bildirir.
         */

    }
}
