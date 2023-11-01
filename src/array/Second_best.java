package array;

import java.util.Arrays;

public class Second_best {
    public static void main(String[] args) {

        int []arr ={19,33,34,45,89};
        int sconMax = SecondB(arr);
        int sconMin = SecondS(arr);
        System.out.println(sconMax);
        System.out.println(sconMin);

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

        public static int SecondS(int[]arr){

        int smaller = Integer.MAX_VALUE;
        int SecS = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length;i++){
            if(arr[i] < smaller){
               SecS = smaller;
               smaller = arr[i];
            } else if (arr[i]<SecS && arr[i] > smaller ) {
                SecS = arr[i];
            }
        }

            return SecS;
        }


    }

