package chapter18.BinarSerch;

public class firstAndLastposition {
    public static void main(String [] args){
    int [] arr ={5,7,7,8,10};
    int [] ans ={-1,-1};
    int n= arr.length;
    //first finnding the binary search
    int target = 8;
    int lo = 0,hi= n-1;
    boolean flag = false;//false mesns not present

        while(lo<=hi) {
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] == target) {
            flag = true ;
            break;
        }
        else if(arr[mid]>target) hi = mid - 1;
        else if(arr[mid ]<target) lo= mid+1;
    }   if(flag ==false) System.out.println (ans);


        //finding the lower bound

        lo =0;
        hi= n-1;
        int lb = n;
        while(lo<=hi){
            int mid = lo+(hi=lo)/2;
            if(arr[mid]>=target){
                lb= Math.min(lb,mid);
                hi = mid-1;
            }
            else lo = mid +1;
        }
        ans[0] = lb;

        //now find upper bound

        lo =0;
        hi= n-1;
        int ub = n;
        while(lo<=hi){
            int mid = lo+(hi=lo)/2;
            if(arr[mid]>=target){
                ub= Math.min(lb,mid);
                hi = mid-1;
            }
            else lo = mid +1;
        }
        ans[1] = ub-1;

        System.out.println(ans);
    }
}
