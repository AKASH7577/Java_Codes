package chapter18.BinarSerch.assignmentQ;
//Given a sorted array of n elements and a target ‘x’. Find the last occurrence of ‘x’ in the array. If ‘x’ does
//not exist return -1.
import java.util.Arrays;
public class Q1 {
    public static void main(String [] args){
        //int arr[]= {1,2,4,4,5,6};
        int [] arr ={10,20,20,20,20,20,30,30,30,40,40};
        int n= arr.length;
        int target= 4;
        int [] ans = new int [1];
        int lp = -1, lo = 0, hi = n-1;

        while(lo <= hi){
            int mid = lo+(hi - lo) /2;
            if(arr[mid]== target) {
                if (mid + 1 < n && arr[mid] == arr[mid + 1]) {
                    lo = mid + 1;
                } else {
                    lp = mid;
                    break;
                }
            }
            else if(arr[mid]<target) {
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
            }
        }
        ans[0] = lp;
        System.out.println(Arrays.toString(ans));
        }

    }

