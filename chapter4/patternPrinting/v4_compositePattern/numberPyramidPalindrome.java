package chapter4.patternPrinting.v4_compositePattern;
import java.util.Scanner;
public class numberPyramidPalindrome {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n; i++){
            for(int j=1;j<=n-i; j++){
                System.out.print(" " +" ");
            }
            for(int j=1; j<=2*n-i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
