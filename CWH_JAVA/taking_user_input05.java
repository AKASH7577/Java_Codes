import java.util.Scanner;
//used for taking user input
public class taking_user_input05 {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number 1");
        int a  = sc.nextInt();
        System.out.println("enter number 2");
        int b =sc.nextInt();
        int sum =a+b;
        System.out.println("the sum of these numbers  is");
        System.out.println(sum);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}
