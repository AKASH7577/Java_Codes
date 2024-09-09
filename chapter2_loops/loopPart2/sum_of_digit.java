package loopPart2;

public class sum_of_digit {
    public static void main(String[] args) {
        int n =5187;
        int sum =0;
        while(n!=0){
            int id = n%10;
            sum += id;
            n/=10;
            System.out.println(n);
        }
    }
}
