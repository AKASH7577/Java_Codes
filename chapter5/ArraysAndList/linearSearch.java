package chapter5.ArraysAndList;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] arrg){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter  a target element :");
        int x=sc.nextInt();
        System.out.println("enter a arrays size: ");
        int n=sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter a arrays element:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //solution
        boolean flag =false; //false means not fount
        for(int i=0; i<n; i++){
            if (arr[i]==x){
                flag =true; //true means found
                break;
            }
        }
        if(flag == true){
            System.out.println("element found ");
        }
        else System.out.println("elment no found ");
    }
}
