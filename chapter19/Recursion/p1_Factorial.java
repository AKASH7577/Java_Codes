package chapter19.Recursion;

public class p1_Factorial {
    public static int facto ( int n){
        if(n==1 || n==0 ) return 1;  //base case//  if condition is true then exit the loop and   print the ans
         int ans = n*facto(n-1); //funtion call
         //return ans first of all calculate the value and then return the value
         return ans;
    }
    public static void main(String [] args){
        int n = 5;
        int result  =  facto(n); // Replace number here with asny positiv integer
        System.out.println("fatorial of number " + n  + " is : " + result);
    }
}
   