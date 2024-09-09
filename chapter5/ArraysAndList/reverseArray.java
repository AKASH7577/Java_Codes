package chapter5.ArraysAndList;
public class reverseArray {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};
        for( int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        //reverse using two pointer
        int i=0,j=arr.length-1;
        while(i<=j){
//            int temp =arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
          //  we use swap function repeatedly
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
}
//we use swap repeatedly the use follow...
public static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]= arr[j];
        arr[j] =temp;
    }
}

//using one pointer
//        int[] arr = {10, 20, 30, 40, 50, 60};
//        for (int ele : arr) {
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//        //reverse using one pointer
//        int n=arr.length;
//        for (int i = 0; i < n/2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[n-1-i];
//            arr[n-1 - i] = temp;
//        }
//        for (int ele : arr) {
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//    }
//}