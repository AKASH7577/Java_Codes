package chapter2_loops;
import java.util.Scanner;
public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  first number");
        int a = sc.nextInt();
        System.out.println("enter a opration ");
        char op = sc.next().charAt(0);
        System.out.println("enter a second number ");
        int b = sc.nextInt();


        if(op =='+'){
            System.out.println(a+b);
        }
        else if(op =='-'){
            System.out.println(a-b);
        }
        else if(op =='*'){
            System.out.println(a*b);
        }
        else{
            System.out.println(a/b);
        }
    }
}
