package chapter18.BinarSerch;

import java.util.ArrayList;
import java.util.Collections;

public class kClosestElement {
    public static void main(String[] args) {
        /*  used to store the result  of the given problem */
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        int n = arr.length;

        if (x < arr[0]) {//in negative
            for (int i = 0; i < k; i++) {
                ans.add(arr[i]);
            }
            System.out.println(ans);
        }

        if(x>arr[n-1]){ // more than arr length
            for(int i=n-1; i>n-k; i--){
                ans.add(arr[i]);//adding the element in arr
            }
            Collections.sort(ans);
            System.out.println(ans);

        }
        //this code of lowerbound
        int lb= n;
        int lo = 0,hi= n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>= x){
                lb= Math.min(lb,mid);
                hi = mid-1;
            }
            else lo = mid+1;
        }
        
        int j=lb , i=lb-1;
        while(k>0 && i>=0 && j<n){
            int di = Math.abs(x-arr[i]);
            int dj = Math.abs(x-arr[j]);
            if(di<=dj){
                ans.add(arr[i]);
                i--;
            }
            else{
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        while(j==n && k>0){
            ans.add(arr[i]);
            i--;
            k--;
        }
        Collections.sort(ans);
        System.out.println(ans);
    }
}