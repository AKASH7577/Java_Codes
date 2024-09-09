package chapter18.BinarSerch;

public class sqart_x {

    public static void main (String [] args){
        int  x=  16;
        //type casting  of int x into long
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
        System.out.println((int)hi);

    }
}
