package chapter18.BinarSerch;

public class smallestDivisor {
    public static void main(String[] args){
        int [] arr = {44,22,33,11,1};
        int n= arr.length;
        int t = 5;
        int mx = Integer.MIN_VALUE;
        System.out.println(mx);

        for(int i = 0; i<n; i++){
            mx= Math.max(mx,arr[i]);
        }
        System.out.println(mx);
        int d =1;
        int lo =1,hi =mx;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int sum =0;
            for(int i=0; i<n;i++){
                if(arr[i]%mid==0) sum +=arr[i]/mid;
                else sum += arr[i]/mid+1;
            }
            if(sum <=t){
                d= mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        System.out.println(d);

    }
}
