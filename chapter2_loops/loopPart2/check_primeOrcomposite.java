package loopPart2;
 import java.util.Scanner;
public class check_primeOrcomposite {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("enter a num ");
        int n =sc.nextInt();
        int x=0;  //prime number
        for(int i=2 ; i<=n-1; i++){
            if(n%i ==0){
                System.out.println("composite number");
                x=1;
                break;
            }
        }
        if(n==1){
            System.out.println("neighter prime no nor composite no ");
        }
        else if(n==0){
            System.out.println("prime number");

        }


    }
}
