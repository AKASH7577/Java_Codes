package chapter5.ArraysAndList;
import java.util.Scanner;
public class outputOfArray {
    public static void main(String[] arrgs){
        Scanner sc =new Scanner(System.in);
        //taking the  user input-->input loop
        System.out.println("Enter Array Size");
        int n=sc.nextInt();
        int arr[] =new int [n];
        for(int i=0; i<=6; i++){
            arr[i] = sc.nextInt();
        }
        //output -->loop
        for(int i=0; i<=6; i++){
            System.out.print(arr[i] + " ");
        }
//        arr[0] =10;
//        arr[1]=20;
//        arr[2]=30;
//        arr[3]=40;
//        arr[4]=50;
//        arr[5]=60;
//        arr[6]=70;
//
//        //output -->
//        for(int i=0; i<=6; i++){
//            System.out.println(arr[i] + " ");
        //  }
        //taking the  user input-->input loop

    }
}

