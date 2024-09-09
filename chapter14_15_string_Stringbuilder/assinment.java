package chapter14_15_string_Stringbuilder;
import java.util.Scanner;

public class assinment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        String s = sc.next();
        int n = s.length();
        //problem no 1
    /*
            String t= "";
             for(int i=0; i<s.length(); i++){
             if(i%2==1) t += '#' ;
             else t +=  s.charAt(i);
             }
              System.out.println(t);
     */
        //problem no 2

    /*      int count =0;
            for(int i=0; i<n; i++){
                char ch = s.charAt(i);
                if(isVowel(ch) != false)
                    count ++;
            }
            System.out.println(count);
        }
        public static boolean isVowel(char ch){
            if(ch ==  'a'|| ch=='A' ) return false;
            if(ch ==  'e'|| ch=='E' ) return false;
            if(ch ==  'i'|| ch=='I' ) return false;
            if(ch ==  'o'|| ch=='O' ) return false;
            if(ch ==  'u'|| ch=='U' ) return false;
            return true;



    */
        //pronblem no 3 palindrome
    /*
        String t= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //above statement mean check all uppercase lowercase and alphnumeric char int lowercase
        if(isPalindrome(s)){
            System.out.println("It is the Palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }

        }
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;

        }
        i++;
        j--;
        return true;

    */

        //Q4. Input a string of even length and reverse the second half of the string
    /*
        StringBuilder sb = new StringBuilder(s);
        int i = n/2, j = n/2;
        while (j<n){
            if (sb.charAt(j)!= ' ') j++;
            else {
                reverse(sb, i,j - 1);
                i = j + 1;
                j = i;
            }
        }
        reverse(sb, i, j-1);
        System.out.println("reversing the 2nd half of string "+sb);
    }
    public static void reverse(StringBuilder sb, int i, int j){
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++; j--;
        }


    */
        // Q5 Input a string of length less than 10 and convert it into integer without using builtin function.
        // Ensure the length is less than 10


//Q6. Input a string and concatenate with its reverse string and print it.
/*
        StringBuilder sb = new StringBuilder(s);
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
        System.out.println(s + sb);
    }
    public static void reverse(StringBuilder sb, int i, int j){
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++; j--;
        }


*/

        //Q9. Given an array of strings. Check whether they are anagram or not
//        System.out.println("enter a string 2: ");
//        String t = sc.next();
//    }
//            public boolean isAnagram(String s, String t) {
//                if(s.length()!= t.length()) return false;
//                char [] a = s.toCharArray();
//                char [] b = t.toCharArray();
//                Arrays.sort(a);
//                Arrays.sort(b);
//                for(int i =0; i<s.length(); i++){
//                    if(a[i]!= b[i]) return false;
//                }
//
//                return true;
//            }

                // Find the word that is lexicographically maximum
                String maxWord = findLexicographicallyMaximumWord(s);

                System.out.println("Lexicographically maximum word: " + maxWord);
            }
            public static String findLexicographicallyMaximumWord(String s) {
                // Split the sentence into words
                String[] words = s.split(" "); // Split on spaces

                // Initialize the maximum word with the first word
                String maxWord = words[0];

                // Compare each word to find the lexicographically maximum one
                for (String word : words) {
                    if (word.compareTo(maxWord) > 0) { // If 'word' is greater than 'maxWord'
                        maxWord = word; // Update 'maxWord'
                    }
                }

                return maxWord; // Return the word that is lexicographically maximum
            }
























}

