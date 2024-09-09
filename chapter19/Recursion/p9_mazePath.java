package chapter19.Recursion;
import java.util.Scanner;

public class p9_mazePath {
    public static  int  maze( int row, int col,int n,int m){
        if(row==n|| col ==m) return 1;
//        if(row>n || col>m) return 1;
//        if(row==n && col==m) return 1;
        int rigthways = maze(row,col+1,m,n);
        int downways = maze(row+1,col,m,n);
        return rigthways + downways;

    }
   public static  int  maze2( int n,int m){
        if(n==1|| m==1 ) return 1;
//        if(row>n || col>m) return 1;
//        if(row==n && col==m) return 1;
        int rigthways = maze2(n,m-1);
        int downways = maze2(n-1,m);
        return rigthways + downways;

    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and col");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(maze(1,1,n,m));
        System.out.println(maze2(m,n));

    }
}
