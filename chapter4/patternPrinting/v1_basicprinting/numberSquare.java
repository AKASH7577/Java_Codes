package chapter4.patternPrinting.v1_basicprinting;
import java.util.Scanner;
public class numberSquare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number :");
        int n =sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j +" " );
            }
            System.out.println();
        }
    }
}
