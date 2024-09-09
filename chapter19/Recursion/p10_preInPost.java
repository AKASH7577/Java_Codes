package chapter19.Recursion;

public class p10_preInPost {
    public static void pip(int n){
        if(n==0) return ;//base case
        System.out.println("pre "+n); //perform before any recursion call
        pip(n-1); //call itself with n-1  and  reduces the problem size and progresses
        //toward base case
        System.out.println("in "+n); //this action performed between the two recursive call
        pip(n-1);
        System.out.println("post"+n);
    }
    public static void main(String []  args){
        pip(3);
    }
}
