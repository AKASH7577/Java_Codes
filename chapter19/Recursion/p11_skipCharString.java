package chapter19.Recursion;

public class p11_skipCharString {
    public static void skip (int i,String  str , String ans ){
        if(i==str.length()) {
            System.out.print(ans);
            return ;
        }
        if(str.charAt(i) != 'a') {
            ans += str.charAt(i);
        }
            skip(i+1,str,ans);
        }

    public static void main(String [] arr){
        String str = "hey akash";
        skip(0,str," ");

    }
}
