package chapter0_basicSorting;

public class cheakArrayIsSortedOrNot {
    public static void main(String []args){
        int [] arr = {12,28,48,45,80};
        boolean  flag = true; //true means sorted
        for(int i=0;i<arr.length; i++){
            if(arr[i]>arr[i+1]){
//                System.out.println("given array is unsorted");
                flag = false; //flase mean unsorted
                break;
            }
        }
        if(flag ==true){
            System.out.println("sorted");
        }
        else System.out.println("unsorted");

    }
}
