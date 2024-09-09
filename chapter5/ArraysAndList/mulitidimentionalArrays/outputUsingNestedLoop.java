package chapter5.ArraysAndList.mulitidimentionalArrays;
import java.util.Scanner;
public class outputUsingNestedLoop {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        int [][] arr= new int [2][3];
        //length oprator
        int m= arr.length;//no of  rows
        int n = arr[0].length;//no of column
        //input of 2D arrays this
        System.out.println("enter a array element ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //output using 2D arrays
        for(int i=0; i<m; i++) {//rows
            for (int j = 0; j < n; j++) {//column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
