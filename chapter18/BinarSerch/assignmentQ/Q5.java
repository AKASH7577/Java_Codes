package chapter18.BinarSerch.assignmentQ;
/*Given a number ‘n’. Predict whether ‘n’ is a valid perfect square or not.

 */
public class Q5 {
    public static boolean isPerfectSquare(int x) {
        if (x < 0) {
            return false;
            // Negative numbers cannot be perfect squares
        }

        long lo = 0, hi = (long) x;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (mid * mid == (long) x) {
                return true; // Found the exact square root
            } else if (mid * mid > (long) x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return false; // No perfect square root found
    }
    public static void main(String[] args){
        int  x=  36;
        //check the no is perfet square root or not
        if(isPerfectSquare(x)){
            System.out.println( x+" is a perfect square ");
        }
        else System.out.println( x + "  is not perfect square ");

        //printing the i integer square root
        long lo=0, hi= (long) x;
        while(lo <= hi){
            long  mid = lo + (hi-lo)/2;
            if(mid*mid ==(long) x) {
                System.out.println((int) mid);

                return ; //exit after finding the exact square root
            }
            else if(mid*mid>(long )x) hi = mid - 1;
            else  lo = mid + 1;
        }
        System.out.println( "the integer square root of  " + x + (int) hi );

    }
}
