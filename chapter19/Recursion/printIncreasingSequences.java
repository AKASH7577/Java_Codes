
package chapter19.Recursion;
import java.util.*;
public class printIncreasingSequences{

    public   static void printIncreasingSequences(int start,int  n , int k, ArrayList<Integer> ans ){
        if (ans.size() == k) {
            System.out.println(ans);
            return;
        }

        for (int i =start ; i <= n; i++) {
            ans.add(i);
            printIncreasingSequences(i + 1, n, k, ans);
            ans.remove(ans.size() - 1);
        }
    }

    public static void main(String [] args) {
        int n = 6;
        int k = 4;

        ArrayList<Integer>  ans = new ArrayList<>();
        printIncreasingSequences(1,n,k,ans );
    }
}

