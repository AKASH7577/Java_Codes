package chapter14_15_string_Stringbuilder;
import java.util.Scanner;
public class fileCountVariable {
    //checking the no of vowel in given string
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string ");
        String s = sc.nextLine();
        int n= s.length();
        int count =0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(isVowel(ch)==true)
                count ++;
        }
        System.out.println(count);
    }
    public static boolean isVowel(char ch){
        if(ch ==  'a'|| ch=='A' ) return true;
        if(ch ==  'e'|| ch=='E' ) return true;
        if(ch ==  'i'|| ch=='I' ) return true;
        if(ch ==  'o'|| ch=='O' ) return true;
        if(ch ==  'u'|| ch=='U' ) return true;
        return false;
    }
}
