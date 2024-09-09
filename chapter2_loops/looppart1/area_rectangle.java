package chapter2_loops;

import java.util.Scanner;

public class area_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a length of rectangle");
        double l = sc.nextDouble();
        System.out.println("enter   a width of rectangle");
        double w = sc.nextDouble();
        double a = l*w;
        System.out.println("area of rectangle");
        System.out.println(a);
    }
}
