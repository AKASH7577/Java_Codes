package chapter2_loops;
import java.util.Scanner;
public class greatest_of_them {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("enter b number");
        int b = sc.nextInt();
        System.out.println("enter c number");
        int c = sc.nextInt();

        if(a>=b&& a>=c){
            System.out.println(a+ "is greatest");}
            else if(b>=a&&b>=c){
                System.out.println("b is gratest");
            }
            else {
            System.out.println("c is greatest");
        }
        }


    }

