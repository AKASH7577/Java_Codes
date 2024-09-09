
package chapter18.BinarSerch;
import java.util.Arrays;
public class fAndLastPostion{
    public static void main(String [] args){
        int [] arr = {10,20,20,20,20,20,30,30,30,40,40};
        int target =20;
        int   n=arr.length;
        int [] ans = new  int [2];

        //first position
        int fp = -1,lo =0,hi = n-1;
        while(lo <= hi){
            int mid = lo + (hi-lo) / 2;
            if(arr[mid] == target) {
                if (mid > 0 && arr[mid] == arr[mid - 1]) {
                    hi = mid - 1;
                } else {
                    fp = mid;
                    break;
                }
            }
             else  if(arr[mid]<target) {
                lo = mid + 1;
            }
                else {
                    hi = mid - 1;
            }
        }

        //last postion
        int lp = -1, lo1 = 0, hi1 = n-1;
        while(lo1 <= hi1){
            int mid = lo1+(hi1 - lo1) /2;
            if(arr[mid]== target) {
                if (mid + 1 < n && arr[mid] == arr[mid + 1]) {
                    lo1 = mid + 1;
                } else {
                    lp = mid;
                    break;
                }
            }
               else if(arr[mid]<target) {
                lo1 = mid + 1;
            }
                else{
                    hi1 = mid - 1;
            }
        }
        ans[0] = fp ;
        ans[1] = lp;
        //Used Arrays.toString(ans) to print the array.
        System.out.println(Arrays.toString(ans));

    }
}