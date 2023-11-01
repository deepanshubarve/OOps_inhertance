package array;

import java.util.Arrays;

public class Second_best {
    public static void main(String[] args) {

        int []arr ={19,33,34,45,89};
        int sconMax = SecondB(arr);
        System.out.println(sconMax);

    }

    public static int  SecondB(int[]arr){
        int max = Integer.MIN_VALUE;
        int Secmax = Integer.MIN_VALUE;

        for(int i = 0 ; i <arr.length ; i++){
            if(arr[i] > max ){
                Secmax = max;
                max = arr[i];
            }else if(arr[i]< max && arr[i]>Secmax) {
                Secmax = arr[i];
            }
            }
        return Secmax;
        }


    }

