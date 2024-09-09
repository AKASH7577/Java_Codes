package chapter18.BinarSerch;
import java.util.*;
public class bs {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {19,37,45,33,90};
        int n= arr.length;
        System.out.println("enter a target");
        int target = sc.nextInt();
        int lo= 0,hi = n-1;
        boolean flag = false;//false means not found
        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(arr[mid]== target){
                flag = true;break;
            }
            else if(arr[mid]>target) {
                hi = mid-1;
            }
            else if(arr[mid]<target) lo= mid+1;
        }
        if(flag ==true) System.out.println("target  present ");
                else System.out.println("target not found");

    }

}
