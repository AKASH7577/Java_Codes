package chapter18.BinarSerch.assignmentQ;

 /*Q2. Given a sorted binary array,
efficiently count the total number of 1’s in it.
*/

public class Q2 {

    public static int countones(int [] arr){

        int n= arr.length;

         //if the array is empty
        if(n == 0) {
             //System.out.println(0) ;
             return 0;
        }

        int lo = 0, hi = n - 1;
        while(lo < hi) {
            int mid =  lo +  (hi - lo) / 2;
            if (arr[mid] == 0) {
                lo = mid + 1;
            } else {
                hi = mid ;
            }
        }
        if(arr[lo] == 0) {
            //System.out.println(0);
            return 0;
        }
        //count of 1s is the total number of elements
        //System.out.println(n - lo);
        return n - lo;
    }

    public static void main(String [] args) {
        int[] arr = {0, 0, 0, 0, 1, 1};
        System.out.println("number is "+ countones(arr));
    }
}