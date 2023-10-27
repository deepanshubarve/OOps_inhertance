package array;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {10, 11, 12, 13, 14, 15, 16, 17};
        int res = binarySearch(arr);
        System.out.println(res);


    }

    public static int binarySearch(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int data = 16;

        while (low <= high) {

            int mid = (low + high) / 2;
            if (arr[mid] < data) {
                low = mid + 1;
            } else if (arr[mid] > data) {
                high = high - 1;
            } else {
                return mid;
            }


        }
        return -1;
    }
}