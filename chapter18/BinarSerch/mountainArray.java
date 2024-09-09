package chapter18.BinarSerch;

public class mountainArray {
    public static void main(String[] args){
        int [] arr = {10,20,30,100,90,80,70,20,10 };
        int n= arr.length;
        int lo= 1,hi = n-2;


        //not an sorted array
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid] >arr[mid+1]){
                System.out.println( mid);
                break; //peak found ,exit loop
            }
            else if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;

            }
        }
    }
}
