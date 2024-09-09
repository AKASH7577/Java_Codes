package chapter19.Recursion;

import java.util.Scanner;

public class p8_stairPath {

        public static int stair(int n){

            if(n<= 1) return 1;
            return stair(n-1) + stair(n-2);
        }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter s number  n");
            int n = sc.nextInt();
            System.out.println( " the fibonacci no is" + stair(n));
        }

    }

