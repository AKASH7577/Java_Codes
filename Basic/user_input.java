package Basic;
import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input square
        System.out.println("enter a number");
        int a = sc.nextInt(); //you take also---- double r = sc.nextDouble();
        System.out.println("square of input number is :");
        System.out.println(a*a);

        //printing the sum of two number
        System.out.println("enter a num1:");
        int x= sc.nextInt();
        System.out.println("enter a num2");
        int y= sc.nextInt();
        int z = x+y;
        //System.out.println("enter a num1:");
        //System.out.println("enter a num2");
        System.out.println("the sum of two number is "+z);


    }
}
