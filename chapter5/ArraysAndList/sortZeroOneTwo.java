package chapter5.ArraysAndList;
//public class sortZeroOneTwo {
//    public static void main(String[] args) {
//        int[] arr = {0, 2, 1, 0, 2, 0, 0, 2, 1, 1, 1, 2, 0};
//        int n = arr.length;
//        //type 1
//        int mid = 0, hi = n - 1, lo = 0;
//        while (mid <= hi) {
//            if (arr[mid] == 0) {
//                int temp = arr[mid];
//                arr[mid] = arr[lo];
//                arr[lo] = temp;
//                lo++;
//                mid++;
//            } else if (arr[mid] == 1) mid++;
//            else {// arr[mid]==2
//                int temp = arr[mid];
//                arr[mid] = arr[hi];
//                arr[hi] = temp;
//                hi--;
//            }
//        }
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//
//    }
    //using creation of swap function
    public class sortZeroOneTwo {
    public static void swap(int []arr,int a,int b){
        //we can use any type of value
        int temp= arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0, 2, 0, 0, 2, 1, 1, 1, 2, 0};
        int n = arr.length;
        int mid = 0, hi = n - 1, lo = 0;
        while (mid <= hi) {
            if (arr[mid] == 0) {
               swap(arr,mid,lo);
                lo++;mid++;
            } else if (arr[mid] == 1) mid++;
            else {// arr[mid]==2
                swap(arr,mid,hi);
                hi--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        }
    }
