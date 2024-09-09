package chapter19.Recursion;
import java.util.Scanner;
public class p5_sumParameters {
    public static void sum(int n, int sum){
        if(n==0){
            System.out.println("the sum of number is");
            System.out.println(sum);
            return ;

        }
        sum(n-1,sum+n);

    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println(" enter the number");
        int n= sc.nextInt();
        sum(n ,0);
    }
}
