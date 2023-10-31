package array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10, 29, 34, 45, 32};

        System.out.println(Arrays.toString(arr));
        Reverser(arr);
        System.out.println(Arrays.toString(arr));
//
//        for( int i = arr.length-1;i >= 0 ; i--){
//            System.out.println(arr[i]);
//        }


    }

    public static void  Reverser(int arr[]){
        int i =0; int j =  arr.length-1;

        while(i<= j ){

            swap(i ,j ,arr);
            i++;
            i--;
        }
    }

    public static void swap(int i,int j,int[] arr){
        int temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;
    }
}
