package chapter4.patternPrinting.v1_basicprinting;
import java.util.Scanner;
public class starSquare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no.of row");
        int m = sc.nextInt();
        System.out.println("enter a no col");
        int n = sc.nextInt();
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }


    }
}
