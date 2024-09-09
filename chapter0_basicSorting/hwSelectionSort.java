package chapter0_basicSorting;

public class hwSelectionSort {
    public static void print(int [] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        //sorting indecresing order

        int [] arr = {10,20,39,8,7};
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
        int mindx = -1;
        for(int j=1; j<n; j++){
            if(arr[j]>min){
                min =  arr[j];
                mindx =  j;
            }
            swap(arr,i,mindx);
        }
        print(arr);

    }
}
}