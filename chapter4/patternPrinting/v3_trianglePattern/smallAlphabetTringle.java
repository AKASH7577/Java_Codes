package trianglePattern;
import java.util.Scanner;
public class smallAlphabetTringle {
    public static void main(String[] args) {
        //type 2
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of row : ");
        int m = sc.nextInt();
        System.out.println("enter a number of col: ");
        int n = sc.nextInt();
        for(int i=1; i<=m;i++){
            for(int j=1; j<= i; j++){
                System.out.print((char)(i+96) +" ");
            }
            System.out.println();
        }

    }
}
