package array;

import java.util.Scanner;




class Solution {

    boolean arraySortedOrNot( int n) {
        Scanner s = new Scanner(System.in);

      n= s.nextInt();

        int[] arr = new int[n];



        for( int i = 0; i < arr.length ; i++){

            for(int j = i+1; j< arr.length ;j++){

                if( i < j ){
                    System.out.println("The given array is sorted");
                    break;
                }else{
                    System.out.println("the given array is not sorted not");
                }


            }

        }


        return false;
    }
}
