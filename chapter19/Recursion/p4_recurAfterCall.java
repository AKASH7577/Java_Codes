package chapter19.Recursion;
    import java.util.Scanner;
    public class p4_recurAfterCall {
        public static void print(int n ){

            //without using extra variable and global variable
            if(n==0) return; //base case
            print(n-1);  //call
            System.out.println(n); //work

        }
        public static  void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number ");
            int n= sc.nextInt();
            print(n);


        }

    }

