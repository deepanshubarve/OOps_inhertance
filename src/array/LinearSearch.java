package array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        int arr[] = {10,23,45,33,2};

        for(int i = 0; i<arr.length;i++){
            if( arr[i] == data);
            System.out.println("the data is found");
            break;
        }

    }
}
