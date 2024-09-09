package Basic;

import java.util.Scanner;

public class chr_data_type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a charater :");
        char ch = sc.next().charAt(0);
        int x =(int)ch; //typing casting
        System.out.println("x");

    }
}
