package chapter19.Recursion;
import java.util.Scanner;

public class maze_path {
    public static int   maze(int row ,int  col,int m,int n){
        if(row ==m || col ==n) return 1;
//        if(row==m && col ==n) return 1;
//        if(row>m || col >n) return 0;
        int rightways = maze(row ,col+1,m,n);
        int downways = maze(row+1,col,m,n);
        return rightways + downways;
    }
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println(" enter a number m and m");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(maze(1,1,m,n));
    }
}
