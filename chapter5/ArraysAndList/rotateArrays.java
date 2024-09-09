package chapter5.ArraysAndList;
public class rotateArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();

        int rotateBy = 2;
        rotateArray(arr, rotateBy);

        // Print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // To handle cases where k is greater than the length of the array

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}




