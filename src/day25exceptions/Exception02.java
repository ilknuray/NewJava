package day25exceptions;

public class Exception02 {
    public static void main(String[] args) {
        //bir strinng arrayden index girerek eleman elde edebilmek icin bir method olusturun
        String arr[]={"Ali","Veli","49","50"};
        getElementFromArray(arr,2);
        getElementFromArray(arr,0);
        getElementFromArray(arr,5);
    }
    public static void getElementFromArray(String arr[],int idx){
        try {
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index asildi ==>"+e.getMessage());
            e.printStackTrace();
        }

    }
}
