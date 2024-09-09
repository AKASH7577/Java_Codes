package chapter2_loops;

import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  a  first number");
        int x = sc.nextInt();
        System.out.println("enter a second number");
        int y =sc.nextInt();

        if(x>0&&y>0){
            System.out.println("point in first quadrent ");
            System.out.println("positive x and y axis");
        }
        else if (x<0 && y<0){
            System.out.println("point in second quadrant ");
            System.out.println("point are negative x and poistive y axis ");
        }
        else if(x<0 && y<0) {
            System.out.println("point in third quadrant ");
            System.out.println("point are negative x and y axis  ");
        }
        else if(x ==0 && y==0) {
            System.out.println("point are in origin");

        }
        else  {
            System.out.println("point in forth quadrent ");
            System.out.println("point are positive a and negative y axis ");

        }

    }
}
