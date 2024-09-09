package chapter2_loops;

import java.util.Scanner;
public class logical_oprator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ex no 1
        System.out.println("enter a num :");
        int n =sc.nextInt();
        if(n>99&&n<1000){
            System.out.println("3 digit number ");
        }
        else{
            System.out.println("no 3 digit number " );
        }
        //ex no 2
        System.out.println("enter a num :");
        int N =sc.nextInt();
        if(N>9999&&N<100000){
            System.out.println("5 digit number ");
        }
        else{
            System.out.println("not  5 digit number " );
        }
    }
}
