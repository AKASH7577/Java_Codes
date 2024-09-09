package chapter19.Recursion;
 import java.util.Scanner;
public class p7_squareRised {
    //method no 1
//    public static int  pow ( int a,int b){ //tc = O(b)
//       if(b==0) return 1;
//       return a*pow(a,b-1);
//    }
    public static int  pow2 ( int a,int b){ //TC = O(log b) //logatithmic method
        if(b==0) return 1;
        int ans = pow2(a,b/2);
        if(b%2 ==0) return ans * ans;
        else return ans* ans * a;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
         System.out.println(" enter b number");
         int b = sc.nextInt();
         //int  result  = pow(a,b); //method 1
        int result  =  pow2(a,b); //method 2
        System.out.println(a + " raised  to the power " + b +  " is: " + result);
    }
}
