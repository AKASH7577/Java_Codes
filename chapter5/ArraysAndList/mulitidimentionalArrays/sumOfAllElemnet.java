package chapter5.ArraysAndList.mulitidimentionalArrays;
import java.util.Scanner;
public class sumOfAllElemnet {
    public static void main(String[] args){
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int m= arr.length;
        int n = arr[0].length;
        System.out.println("enter a element in arrays:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        int sum =0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                sum += arr[i][j];
            }
        }
        System.out.print("the sum of all element is:"+ sum);
    }
}
