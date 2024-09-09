package chapter19.Recursion;

public class p14_permutation {
    public static void permutation(String ans, String str) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            permutation(ans + ch, left + right);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutation("", str);

    }
}