package chapter4.patternPrinting.pratice;
import java.util.Scanner;
public class starPlus {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int d=n/2;
        for(int i=1;i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==d || j==d){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
