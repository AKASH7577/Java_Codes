package chapter4.patternPrinting.v4_compositePattern;
import java.util.Scanner;
public class starPyramind {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number : ");
        int n =sc.nextInt();
        //method 1
//        for(int i=1; i<=n; i++){
//            for(int j =1; j<=n-i; j++){
//                System.out.print(" " + " ");
//            }
//            for(int j=1; j<=2*i-1; j++){
//                System.out.print("*" + " ");
//            }
        //method 2 extra variable
        int nsp =n-1;
        int nst=1;
        for(int i=1; i<=n; i++){
            for(int j =1; j<=nsp; j++){
                System.out.print(" " + " ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp -=1;
            nst+=2;

        }
    }
}
