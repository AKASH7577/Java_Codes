package chapter2_loops;

import java.util.Scanner;

public class profit_loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price ");
        int cp = sc.nextInt();
        System.out.println("enter the selling  price ");
        int sp = sc.nextInt();


        if(sp>cp){
            System.out.println("profit is :");
            System.out.println(sp-cp);
        }
        else{
            System.out.println("loss is :");
            System.out.println(cp-sp);
        }
        if(sp==cp){
            System.out.println("no profit, no loss ");
        }
    }

}
