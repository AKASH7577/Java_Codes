package chapter14_15_string_Stringbuilder;
import java.util.Scanner;
public class convertIntToString {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        //Q3 take input number and conver int to string
        System.out.println("enter a number");
        int n= sc.nextInt();
//        String s =" ";
//        s+=n;
        //String s= ""+n;
        //insted of this
        String s = Integer.toString(n);
        System.out.println(s);
        //return total no digits without using the loop
        System.out.println("the length of the digits" + s.length());
    }
}
