package chapter19.Recursion;
 import java.util.Scanner;
public class fibonacciNumber {
    public static int fibo(int n){

        if(n<= 1) return 1;
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter s number  n");
        int n = sc.nextInt();
        System.out.println( " the fibonacci no is" + fibo(n));
    }
}
