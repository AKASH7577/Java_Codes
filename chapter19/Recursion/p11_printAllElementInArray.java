package chapter19.Recursion;

public class p11_printAllElementInArray {
    public static void print(int i,int [] arr){
        if(i==arr.length) return ;
        System.out.print(arr[i] +" ");
        print(i+1,arr);
    }
    public static void main(String[] args){
        int [] arr = {10,2,3,4,5,6};
        int n = arr.length;
        print(0,arr);
    }
}
