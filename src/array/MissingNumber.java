package array;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {0, 2, 1};
        int n = arr.length;
        int Cur = 0;
        int sum = (n * (n + 1)) / 2;

        for (int i = 0; i < n; i++) {
            Cur = Cur + arr[i];
        }
        sum = sum - Cur;
        System.out.println(Arrays.toString(arr));

    }
}


