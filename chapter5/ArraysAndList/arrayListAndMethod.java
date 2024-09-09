package chapter5.ArraysAndList;
import java.util.Arrays;
public class arrayListAndMethod {
    public static void main(String[] args) {
        int [] arr ={30,40,50,66,90,34,6,88};
        //using for loop
//        for(int i=0; i<=arr.length; i++){
//            System.out.println(arr[i] + " ");
//        }
        //using for each loop
        for(int ele:arr){
            System.out.println(ele + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
