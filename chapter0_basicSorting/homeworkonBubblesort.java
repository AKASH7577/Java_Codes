package chapter0_basicSorting;

public class homeworkonBubblesort {
    public static void print(int [] arr){
        for( int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, 24, 41, 4, 3};
        int n = arr.length;
        print(arr);
        //sorting the array in decreseing order
        for (int j = 0; j < n - 1; j++) { ///n-1 phasses
            boolean flag = true;
            for (int i = 0; i < n - 1 - j; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
            if(flag ==true) break;
        }
        print(arr);
    }
}