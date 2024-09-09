package compositePattern;
import java.util.Scanner;
public class starTringleFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {//rows
//            for (int j = 1; j <= n - 1; j++) {
            for (int j =1;j<=n-i; j++) {
                System.out.print("#" + " ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
            /* printing the normal  star tringle
            ******
            ****
            ***
            **
            *
//              */
        }
    }
}
