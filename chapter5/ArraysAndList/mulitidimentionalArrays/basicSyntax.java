package chapter5.ArraysAndList.mulitidimentionalArrays;
import java.util.Scanner;
public class basicSyntax {
    public static void main(String[]args) {
        int [][] arr = new int [2][3];//declaration and  memory allocation
        //initialisation
        arr[0][0] =10;
        arr[0][1] =20;
        arr[0][2] =30;
        arr[1][0] =40;
        arr[1][1] =50;
        arr[1][2] =60;
        System.out.println(arr[0][0]);
    }
}
