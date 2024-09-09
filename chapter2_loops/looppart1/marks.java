package chapter2_loops;
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A MARKS ");
        int m = sc.nextInt();
        if(m>=81){
            System.out.println("very very good ");
        }
        else if(m>=61){
            System.out.println("good");
        }
        else if(m>=41){
            System.out.println("average");
        }
        else if(m>=30){
            System.out.println("pass");
        }
        else{
            System.out.println("fail ");
            System.out.println("try to next year, best of luck");
        }

    }
}
