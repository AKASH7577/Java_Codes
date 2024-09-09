package chapter14_15_string_Stringbuilder;
import java.util.Scanner;
public class printAllSubstring {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word");
        String s = sc.next();
        System.out.println(s);
        int n = s.length();
        for (int i = 0; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.print(s.substring(i, j) + " ");
            }
        }
        System.out.println();
    }
}
