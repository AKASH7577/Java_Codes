package chapter19.Recursion;
import java.util.*;
public class pr12b_numsubset {

        public   static void printSubset(int i,int [] nums ,ArrayList<Integer> ans,List<List<Integer>> result ){
            if(i==nums.length){
                result.add(new ArrayList<>(ans));
                System.out.print(ans);

                return ;
            }

            int  x = nums[i];

            ans.add(nums[i]);
            printSubset(i+1 ,nums,  ans,result);

            ans.remove(ans.size() - 1);
            printSubset(i+1,nums,ans,result );
        }
        public static void main(String [] args) {
            int [] nums = {1,2,3,4};
            List<List<Integer>> result = new ArrayList<>();
            ArrayList<Integer>  ans = new ArrayList<>();
            printSubset(0,nums,ans,result);
        }
    }

