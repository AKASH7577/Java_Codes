package chapter18.BinarSerch;

public class searchInRotatedArray {
    public static void main (String[] args){
        int [] arr = {4,5,6,7,0,1,2,3};
        int n= arr.length;
        int target = 3;
        int lo = 0, hi = n-1;

        while(lo<=hi){
            int mid = lo + (hi - lo) / 2;

            if(arr[mid]==target){
                System.out.println(mid);
                //break; //exit the program
            }

            //check if the  right side is sorted
            else if(arr[mid]<=arr[hi]){ //i am in right sorted order(mid to high everthing is sorted)
                if(target>arr[mid]&& target<=arr[hi])
                    lo = mid + 1;
                else
                    hi = mid -1;
            }
            //otherwise ,the left side must be sorted
             ///i am in left sorted order(lo to mid everything is sortred)
                else{
                if(target >= arr[lo] &&  target < arr[mid]) hi = mid-1;
                else lo  = mid +1;

            }
        }
        System.out.println(-1); //Target not found
    }
}
