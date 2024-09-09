package chapter4.patternPrinting.pratice;
import java.util.Scanner;
public class oddNumbertriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        //i try
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j <=i; j++) {
//                if (j % 2 == 1) {
//                    System.out.print(j + " ");
//                }
//            }
//            System.out.println();
//        }

        for(int i=0; i<n; i++){
            int num=1;
            for(int j=0; j<=i; j++){
                System.out.print(num + " ");
                num+=2;
            }
            System.out.println();
        }
    }
}