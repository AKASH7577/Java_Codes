package chapter14_15_string_Stringbuilder;
import java.util.Scanner;
public class toggle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        for(int i=0; i<n; i++){
            char ch = sb.charAt(i);
            int ascii =(int)ch;    //The current character is retrieved (char ch = sb.charAt(i);).
                                 // The ASCII value of the character is obtained (int ascii =(int)ch;).
            if(ascii>=65 && ascii<=90){
                ascii+=32;
                ch = (char)ascii;  //type cast
                sb.setCharAt(i,ch);
            }
             else if(ascii>=97 && ascii<=122){
                ascii-=32;
                ch = (char)ascii;
                sb.setCharAt(i,ch); //StringBuilder is updated with this new character
        }
    }
        System.out.println(sb);
        System.out.println(n);
}}
