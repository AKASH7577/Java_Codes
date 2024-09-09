package chapter14_15_string_Stringbuilder;
import java.util.Scanner;
public class reverseStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        StringBuilder sb = new StringBuilder(sc.next());
        int n = sb.length();
        /*  revere the entire string
        int n= sb.length();
        reverse(sb,0, sb.length()-1);
        System.out.println(sb);
    }
         */
        int i = 0, j = 0;
        while (j<n){
            if (sb.charAt(j)!= ' ') j++;
            else {
                reverse(sb, i,j - 1);
                i = j + 1;
                j = i;
            }
        }
            reverse(sb, i, j-1);
        System.out.println(sb);
    }
  public static void reverse(StringBuilder sb, int i, int j){
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++; j--;
        }
    }
}
