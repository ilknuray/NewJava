package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //EX:[0,2,3,0,12,0] sifirlari sona koyunuz
        int arr[] = {0, 2, 3, 0, 12, 0};
        Arrays.sort(arr);
        int arr2[] = new int[arr.length];

        int idx=0;

        for (int i = 0; i <arr2.length ; i++) {
            if (arr[i]!=0){
                arr2[idx]=arr[i];
                idx++;
            }
        }
        System.out.println("arr = " + arr);

        }

    }

