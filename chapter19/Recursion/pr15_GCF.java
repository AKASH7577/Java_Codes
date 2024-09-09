package chapter19.Recursion;
import java.util.*;
public class pr15_GCF {
    public static int findHCF(int  a,int b){
        if(b%a==0){
            return a;

        }
        return findHCF( b%a,a);

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2 = sc.nextInt();
        int hcf = findHCF(num1,num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

    }
}


