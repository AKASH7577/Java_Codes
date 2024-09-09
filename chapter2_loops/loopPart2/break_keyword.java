package loopPart2;

import java.util.Scanner;

public class break_keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for(int i=2; i<=n; i++){
            if(n%i ==0){
                System.out.println("composite number");
                break;
                }
            }
        }
    }
