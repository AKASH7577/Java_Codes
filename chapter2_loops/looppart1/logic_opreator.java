package chapter2_loops;
import java.util.Scanner;
public class logic_opreator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if(n>99999 && n<100000){
            System.out.println("five digit number");
        }
        else{
            System.out.println("not five digit number ");
        }
    }
}
