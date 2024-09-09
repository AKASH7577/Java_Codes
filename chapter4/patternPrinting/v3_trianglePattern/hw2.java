package trianglePattern;
import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of row : ");
        int m = sc.nextInt();
        System.out.println("enter a number of col: ");
        int n = sc.nextInt();
        for(int i=1; i<=m;i++){
            for(int j=1; j<= n; j++){
                System.out.print((j+96) +" ");
            }
            System.out.println();
        }

    }
}
