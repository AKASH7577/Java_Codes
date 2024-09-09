package chapter5.ArraysAndList;
public class rollNumber {
    public static void main(String[] arrg){
        int [] arr = {81,45,67,100,12,34,56,24};
        for(int i=0; i<arr.length; i++){
            if(arr[i]<35)
                System.out.print("Roll number is:"+i + " ");
        }
    }
}
