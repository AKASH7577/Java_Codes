package chapter5.ArraysAndList;
import java.util.Arrays;
public class copyOfArray {
    public static void main(String[] args){
        int [] arr = { 27,90,39,88,99,20,9};
        for(int ele: arr){
            System.out.print(ele +" ");
        }
        System.out.println();
//        int [] nums =arr; //shallow -- means the change in number it will replect the original array
//        nums[0]=70;
//        System.out.println(arr[0]);//avoiding of this we use deep copy array
        //deep copy
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] =70;
        System.out.println(arr[0]);
        int [] crr =new int[arr.length];
        for(int i =0; i<arr.length; i++){
            crr[i] = arr[i];
        }
        crr[0] =100;
        System.out.println(arr[0]);
    }
    }

