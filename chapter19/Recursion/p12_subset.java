package chapter19.Recursion;
import java.util.*;
public class p12_subset {
    //
    //creating  global array list ---- global any function can be assces
    static  ArrayList<String> arr = new ArrayList<>();
    public static void printSubsets(int i,String s , String ans){
        if(i==s.length()){
//            System.out.println(ans);
            //storing in array list
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubsets(i+1,s,ans +ch); // not take
        printSubsets(i+1,s,ans); // take

    }
    public static void main(String [] args){
        String s = "abcd";
        arr = new ArrayList<>();  //reset
        printSubsets(0,s,"");
        // printing the array list
        System.out.println(arr);
    }
}
