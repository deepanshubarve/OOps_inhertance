package array;

public class SumOfArray {
    public static void main(String[] args) {

        int arr[] = { 10,29,34,45,32};
        //sum of array using for loop

        int sum = 0;
        for( int i =0 ; i< arr.length ; i++){

            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
