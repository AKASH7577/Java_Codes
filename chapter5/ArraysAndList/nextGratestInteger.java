package chapter5.ArraysAndList;

public class nextGratestInteger {
    public static void main(String[] args) {
        int[] arr ={12,8,41,37,2,49,16,28,21};
        int n= arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;
        int  nge = arr[n-1];
        for(int i= n-2; i>=0; i--){
            ans[i]=nge;
            nge = Math.max(nge,arr[i]);//update
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele: ans){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
