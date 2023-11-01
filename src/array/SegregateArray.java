package array;

import java.util.Arrays;

public class SegregateArray {

    public static void main(String[] args) {



        int[] arr = {1, 0, 1, 0, 0, 1};
        //Segregation(arr);
        Seg(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void Segregation(int arr[]) {

        int count = 0;

        for (int value : arr) {
            if (value == 0)
                count++;
        }


            for (int i = 0; i < count; i++) {
                arr[i] = 0;
            }

            for (int i = count; i < arr.length; i++) {
                arr[i] = 1;
            }

        }

    private static void Seg(int []arr){

        int i=0; int j = arr.length-1;

        while(i<=j){
            if(arr[i] == 1){
                if(arr[j] == 0){
                    swap(i,j,arr);
                }

                j--;
            }else {
                i++;
            }
        }
    }

    public static void swap(int i,int j,int[] arr){
        int temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;
    }

}


