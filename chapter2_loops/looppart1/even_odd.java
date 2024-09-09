package chapter2_loops;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a number");
        int a =sc.nextInt();
        if(a%2 ==0){
            System.out.println("even Number");
        }
        else{
            System.out.println("odd Number");
        }
    }
}
