package array;

import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2};

        for(int i =1;i<arr.length;i++){
            if(arr[i-1] < arr[i]){
                System.out.println(arr[i]);
            }
        }

    }
}




