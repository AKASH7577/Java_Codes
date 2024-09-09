package chapter18.BinarSerch;


public class shipWithinDays  {

    public  boolean  isPossible(int mid , int [] arr ,int d){
        int n = arr.length;
        int load =0;
        int days =1;

        for(int i=0; i<n; i++){
            if(load +arr[i]<=mid) load  += arr[i];
            else {
                load = arr[i];
                days ++;
            }
        }
         return days <=d;
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int n= arr.length;
        int d = 5;
        int  sum = 0, mx= Integer.MIN_VALUE;

        for(int i =0;i<n; i++){
            mx = Math.max(mx,arr[i]);//finding the max ele in the arr
            sum += arr[i];
        }

        int lo= mx,hi = sum,minC = sum;
        shipWithinDays solution = new shipWithinDays(); // Create an instance to call isPossible

        while(lo<=hi){ //Toc = 0(n-(sum-mx)) //binary search
            int mid = lo+(hi-lo)/2;
            if( solution.isPossible (mid,arr,d)){
                minC = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        System.out.println("minimum capacity of the ship all pacakages within "+d+" days is: "+ minC);

    }
}
