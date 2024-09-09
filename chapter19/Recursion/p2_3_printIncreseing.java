package chapter19.Recursion;
import java.util.Scanner;

public class p2_3_printIncreseing {
    //method no 1
//    public static void print(int n){
//        if(n==0) return ; //base case
//        System.out.println(n); //work
//        print(n-1); //call
//    }

    // method no 2 :using the global variable
//     static  int n;
//    public static void print(int x){
//        if(x>n) return ; //base case
//        System.out.println(x); //work
//        print(x+1); //call
//    }

    // method 3: using the extra  parameters
    public static void print(int x ,int  n){
        if( x > n) return ; //base case
        System.out.println(x); //work
        print(x+1 ,n); //call
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
          int  n = sc.nextInt();
        //print(n) ;//for method no 1
        //print(1); //for method no 2
        print(1,n); //for method no 3
    }
}
