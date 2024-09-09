package chapter5.ArraysAndList;
public class secondLargetElement {
    public static void main(String[] args) {
        int [] arr ={ -45,-66,-55,-6,-3,-90,-66};
//        int mx=arr[0];
       int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mx) mx=arr[i];
        }
        int smx= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] !=mx) smx =Math.max(smx,arr[i]);
        }
        System.out.println(mx);
        System.out.println(smx);
    }
}
