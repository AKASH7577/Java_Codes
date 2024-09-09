package chapter4.patternPrinting.v4_compositePattern;
import  java.util.Scanner;
public class numberpyraamindpalindromed_starBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number n:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {//rows
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {//stars
                System.out.print(j + " ");
            }
            for(int j=i-1; j>=1; j--){
                System.out.println(j+" ");
            }

            System.out.println();
        }
    }
}