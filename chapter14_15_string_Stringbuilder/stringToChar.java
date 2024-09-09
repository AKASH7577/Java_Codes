package chapter14_15_string_Stringbuilder;
import java.util.Arrays;
public class stringToChar {
    public static void main(String[] args){
        String s = " raghav";
        char[] ch = {'z','g','b','y'};
        for(char ele: ch){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele: ch){
            System.out.print(ele);
        }
        System.out.println();
    }
}
