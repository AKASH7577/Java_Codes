package chapter4.patternPrinting.v4_compositePattern;
import java.util.Scanner;
public class numberBridge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number n :");
        int n =sc.nextInt();

        for(int i=1; i<=2*n-1; i++){
            System.out.print(i + " ");
        }
        n--;
        int nsp=1;
        for(int i=1; i<=n; i++){
            int a=1;
            for(int j=1; j<=n+1-i; j++){
                System.out.print(a + " ");
                a++;
            }
            for(int j=1; j<=nsp; j++){
                System.out.print(" " +" ");
                a++;
            }
            nsp+=2;
            for(int j=5; j<=n+5-i; j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
