package chapter5.ArraysAndList.mulitidimentionalArrays;
import java.util.Scanner;
public class storeMarksAndRollNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[4][2];
        System.out.println("enter a roll number and marks: ");
        for(int i=0;i<4;i++){
            for(int j=0; j<2; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<4; i++){
            for(int j= 0; j<2; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
