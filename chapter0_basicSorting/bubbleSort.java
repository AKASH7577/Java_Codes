package chapter0_basicSorting;

public class bubbleSort {
    public static void print(int [] arr){
        for( int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){

        //checking the given array is sorted or not
         int [] arr = {1,34,45,3,2,90};
         int n= arr.length;
         print(arr);

         //Bubble sort 1
//         for(int j=0;j<n-1; j++){
//             for(int i=0; i<n-1-j; i++){
//                 if(arr[i]>arr[i+1]){
//                     int temp = arr[i];
//                     arr[i]= arr[i+1];
//                     arr[i+1] = temp;
//                 }
//             }
//         }

        //Bubble sort 2
//        for(int j=1;j<n-1; j++){
//            for(int i=0; i<n-1; i++){
//                if(arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i]= arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }

        //optimised bubble sort
        for(int j=0;j<n-1; j++){ ///n-1 phasses
            boolean flag = true;
            for(int i=0; i<n-1-j; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
            if(flag ==true ) break;
        }
         print(arr);


    }
}
